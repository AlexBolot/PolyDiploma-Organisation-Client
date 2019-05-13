package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.*;
import fr.polytech.polydiploma.remote.stubs.Date;

import java.time.LocalTime;
import java.util.*;

public class DisplayPlanning extends Command<PolydiplomaOrganisationPublicAPI> {
    @Override
    public String identifier() {
        return "afficher_planning";
    }

    @Override
    public void execute() {
        Planning planning = shell.system.organisation.getPlanning();
        Date date = planning.getDateOfCeremony();
        Timeslot timeslot = planning.getTimeslot();

        try {

            String dateString = date.getDay() + "/" + date.getMonth() + "/" + date.getYear();
            String startString = timeslot.getStartingHour() + "h" + timeslot.getStartingMinute();
            String endString = timeslot.getEndingHour() + "h" + timeslot.getEndingMinute();

            log("La cérémonie est prévue pour le " + dateString + " de " + startString + " a " + endString + "\n\n");

        } catch (NullPointerException e) {
            log("La date et l'heure de la cerenomie n'est toujours pas définie\n\n");
        }
//        if (planning.getTimeslots().getEntry().isEmpty()) {
//            System.out.println("    Il n'y a aucun intervenant avec un horaire");
//        } else {
//            planning.getTimeslots().getEntry().forEach(entry -> System.out.println("    L'intervenant "
//                    + entry.getKey().getFirstname() + " "
//                    + entry.getKey().getLastname() + " passe de "
//                    + entry.getValue().getStartingHour() + "h" + entry.getValue().getStartingMinute()
//                    + " a " + entry.getValue().getEndingHour() + "h" + entry.getValue().getEndingMinute()));
//        }
//        if (planning.getFieldsTimeslots().getEntry().isEmpty()) {
//            System.out.println("    Il n'y a aucune filières avec un horaire");
//        } else {
//            planning.getFieldsTimeslots().getEntry().forEach(entry -> System.out.println("    La filière "
//                    + entry.getKey().value() + " " + " passe de "
//                    + entry.getValue().getStartingHour() + "h" + entry.getValue().getStartingMinute()
//                    + " a " + entry.getValue().getEndingHour() + "h" + entry.getValue().getEndingMinute()));
//        }


        Map<Timeslot, Speaker> timeslots = new HashMap<>();
        shell.system.organisation.getSpeakerTimeslot().getEntry().forEach(entry -> timeslots.put(entry.getKey(), entry.getValue()));
        Map<Timeslot, Field> fieldTimeslots = new HashMap<>();
        shell.system.organisation.getFieldTimeslot().getEntry().forEach(entry -> fieldTimeslots.put(entry.getKey(), entry.getValue()));

        List<Timeslot> speakerList = new ArrayList<>(timeslots.keySet());
        List<Timeslot> fieldList = new ArrayList<>(fieldTimeslots.keySet());

        speakerList.sort(Comparator.comparing(o -> LocalTime.of(o.getStartingHour(), o.getStartingMinute())));
        fieldList.sort(Comparator.comparing(o -> LocalTime.of(o.getStartingHour(), o.getStartingMinute())));

        if (timeslots.isEmpty() && fieldTimeslots.isEmpty()) {
            log("Il n'y a pas de creneau pour le planning a l'heure actuelle");
        }


        int speakerIndex = 0;
        int fieldIndex = 0;
        while (speakerIndex < speakerList.size() || fieldIndex < fieldList.size()) {
            if (speakerIndex >= speakerList.size() && fieldIndex < fieldList.size()) {
                Timeslot t = fieldList.get(fieldIndex);
                Field f = fieldTimeslots.get(t);
                log("La promotion de la filière " + f.toString() + " passe de " + t.getStartingHour() + "h" + t.getStartingMinute() + " à " + t.getEndingHour() + "h" + t.getEndingMinute());
                fieldIndex++;
            }

            else if (fieldIndex >= fieldList.size() && speakerIndex < speakerList.size()) {
                Timeslot t = speakerList.get(speakerIndex);
                Speaker s = timeslots.get(t);
                log("Le VIP " + s.getFirstname() + " " + s.getLastname() + " passe de " + t.getStartingHour() + "h" + t.getStartingMinute() + " à " + t.getEndingHour() + "h" + t.getEndingMinute());
                speakerIndex++;
            }

            else if (fieldIndex < fieldList.size() && speakerIndex < speakerList.size()) {
                Timeslot t1 = speakerList.get(speakerIndex);
                Timeslot t2 = fieldList.get(fieldIndex);

                if (LocalTime.of(t1.getStartingHour(), t1.getStartingMinute()).isBefore(LocalTime.of(t2.getStartingHour(), t2.getStartingMinute()))) {
                    Speaker s = timeslots.get(t1);
                    log("Le VIP " + s.getFirstname() + " " + s.getLastname() + " passe de " + t1.getStartingHour() + "h" + t1.getStartingMinute() + " à " + t1.getEndingHour() + "h" + t1.getEndingMinute());
                    speakerIndex++;
                } else {
                    Field f = fieldTimeslots.get(t2);
                    log("La promotion de la filière " + f.toString() + " passe de " + t2.getStartingHour() + "h" + t2.getStartingMinute() + " à " + t2.getEndingHour() + "h" + t2.getEndingMinute());
                    fieldIndex++;
                }

            }
        }

    }

    @Override
    public String describe() {
        return "Affiche le planning";
    }
}

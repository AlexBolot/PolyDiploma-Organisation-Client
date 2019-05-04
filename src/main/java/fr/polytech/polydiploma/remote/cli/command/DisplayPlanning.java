package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Date;
import fr.polytech.polydiploma.remote.stubs.Planning;
import fr.polytech.polydiploma.remote.stubs.Timeslot;

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

            log("La cérémonie est prévue pour le " + dateString + " de " + startString + " a " + endString);

        } catch (NullPointerException e) {
            log("La date et l'heure de la cerenomie n'est toujours pas défini");
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
    }

    @Override
    public String describe() {
        return "Affiche le planning";
    }
}

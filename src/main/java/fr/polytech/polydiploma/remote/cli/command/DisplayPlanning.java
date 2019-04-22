package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Date;
import fr.polytech.polydiploma.remote.stubs.Planning;

public class DisplayPlanning extends Command<PolydiplomaOrganisationPublicAPI> {
    @Override
    public String identifier() {
        return "afficher";
    }

    @Override
    public void execute() throws Exception {
        Planning planning = shell.system.organisation.getPlanning();
        Date date = planning.getDateOfCeremony();
        try {
            System.out.println("    La cérémoni est prévu pour le " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear()
                    + " de " + planning.getTimeslot().getStartingHour() + "h" + planning.getTimeslot().getStartingMinute() + " a "
                    + planning.getTimeslot().getEndingHour() + "h" + planning.getTimeslot().getEndingMinute() + ".");
        } catch (NullPointerException e) {
            System.out.println("    La date et l'heure de la cerenomy n'est toujours pas défini\n");
        }
        if (planning.getTimeslots().getEntry().isEmpty()) {
            System.out.println("    Il n'y a aucun intervenant avec un horaire");
        } else {
            planning.getTimeslots().getEntry().forEach(entry -> {
                System.out.println("    L'intervenant " + entry.getKey().getFirstname() + " "
                        + entry.getKey().getLastname() + " passe de "
                        + entry.getValue().getStartingHour() + "h" + entry.getValue().getStartingMinute()
                        + " a " + entry.getValue().getEndingHour() + "h" + entry.getValue().getEndingMinute());
            });
        }
    }

    @Override
    public String describe() {
        return "Affiche le planning";
    }
}

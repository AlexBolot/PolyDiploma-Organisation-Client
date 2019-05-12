package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Field;
import fr.polytech.polydiploma.remote.stubs.Timeslot;

import java.util.List;

public class SetFieldTimeslot extends Command<PolydiplomaOrganisationPublicAPI> {

    private String fieldString;
    private int startingHour;
    private int startingMinute;
    private int endingHour;
    private int endingMinute;

    @Override
    public String identifier() {
        return "horaire_filiere";
    }

    @Override
    public void execute() throws Exception {
        Field field = Field.valueOf(fieldString);

        Timeslot timeslot = new Timeslot();
        timeslot.setStartingHour(startingHour);
        timeslot.setStartingMinute(startingMinute);
        timeslot.setEndingHour(endingHour);
        timeslot.setEndingMinute(endingMinute);

        if (shell.system.organisation.setFieldTimeslot(field, timeslot))
            log("Le creneau pour la filière " + fieldString + " a bien été enregistré");
        else
            log("Il y a eu une erreru lors de l'enregistrement du creneau pour la filière");
    }

    @Override
    public void load(List<String> args) {
        fieldString = args.get(0);
        startingHour = tryParse(args.get(1));
        startingMinute = tryParse(args.get(2));
        endingHour = tryParse(args.get(3));
        endingMinute = tryParse(args.get(4));
    }

    @Override
    public String describe() {
        return "Ajoute un crénaux pour la remise des diplômes d'une fillière (horaire_filiere FILIERE HEURE_DEBUT MINUTE_DEBUT HEURE_FIN MINUTE_FIN)";
    }
}

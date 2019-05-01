package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Field;
import fr.polytech.polydiploma.remote.stubs.Timeslot;

import java.util.List;

public class SetFieldTimeslot extends Command<PolydiplomaOrganisationPublicAPI> {

    private String fieldString;
    private String startingHour;
    private String startingMinute;
    private String endingHour;
    private String endingMinute;

    @Override
    public String identifier() {
        return "timeslotFiliere";
    }

    @Override
    public void execute() throws Exception {
        Field field = Field.valueOf(fieldString);

        Timeslot timeslot = new Timeslot();
        timeslot.setStartingHour(Integer.parseInt(startingHour));
        timeslot.setStartingMinute(Integer.parseInt(startingMinute));
        timeslot.setEndingHour(Integer.parseInt(endingHour));
        timeslot.setEndingMinute(Integer.parseInt(endingMinute));

        shell.system.organisation.setFieldTimeslot(field, timeslot);
    }

    @Override
    public void load(List<String> args) {
        fieldString = args.get(0);
        startingHour = args.get(1);
        startingMinute = args.get(2);
        endingHour = args.get(3);
        endingMinute = args.get(4);
    }

    @Override
    public String describe() {
        return "Ajoute un crénaux pour la remise des diplômes d'une fillière (timeslotFiliere FILIERE HEURE_DE_DEBUT MINUTE_DE_DEBUT HEURE_DE_FIN MINUTE_DE_FIN)";
    }
}

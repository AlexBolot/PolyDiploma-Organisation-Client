package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Date;
import fr.polytech.polydiploma.remote.stubs.Timeslot;

import java.util.List;

public class SetDateAndHour extends Command<PolydiplomaOrganisationPublicAPI> {

    private String startingHour;
    private String startingMinute;
    private String endingHour;
    private String endingMinute;
    private String day;
    private String month;
    private String year;

    @Override
    public String identifier() {
        return "date";
    }

    @Override
    public void execute() throws Exception {
        Date date = new Date();
        Timeslot timeslut = new Timeslot();

        try {
            date.setDay(Integer.parseInt(day));
            date.setMonth(Integer.parseInt(month));
            date.setYear(Integer.parseInt(year));

            timeslut.setStartingHour(Integer.parseInt(startingHour));
            timeslut.setStartingMinute(Integer.parseInt(startingMinute));
            timeslut.setEndingHour(Integer.parseInt(endingHour));
            timeslut.setEndingMinute(Integer.parseInt(endingMinute));
        } catch (NumberFormatException e) {
            System.err.println("    Erreur : les paramétres doivent être des nombres");;
        }

        shell.system.organisation.setDateOfCerenomy(date, timeslut);
    }

    @Override
    public void load(List<String> args) {
        day = args.get(0);
        month = args.get(1);
        year = args.get(2);
        startingHour = args.get(3);
        startingMinute = args.get(4);
        endingHour = args.get(5);
        endingMinute = args.get(6);
    }

    @Override
    public String describe() {
        return "Definir une date and les horaires de la cerenomy (date JOUR MOIS ANNEE HEURE_DE_DEBUT MINUTE_DE_DEBUT HEURE_DE_FIN MINUTE_DE_FIN)";
    }
}

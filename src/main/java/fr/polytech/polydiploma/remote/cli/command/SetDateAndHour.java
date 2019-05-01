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
        return "definir_date";
    }

    @Override
    public void execute() {
        Date date = new Date();
        Timeslot timeslut = new Timeslot();

        date.setDay(tryParse(day));
        date.setMonth(tryParse(month));
        date.setYear(tryParse(year));

        timeslut.setStartingHour(tryParse(startingHour));
        timeslut.setStartingMinute(tryParse(startingMinute));
        timeslut.setEndingHour(tryParse(endingHour));
        timeslut.setEndingMinute(tryParse(endingMinute));

        shell.system.organisation.setDateOfCeremony(date, timeslut);
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
        return "Définir une date et les horaires de la cérémonie (definir_date JOUR MOIS ANNEE HEURE_DEBUT MINUTE_DEBUT HEURE_FIN MINUTE_FIN)";
    }
}

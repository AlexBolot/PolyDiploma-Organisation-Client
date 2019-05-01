package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Date;
import fr.polytech.polydiploma.remote.stubs.Timeslot;

import java.util.List;

public class SetDateAndHour extends Command<PolydiplomaOrganisationPublicAPI> {

    private int startingHour;
    private int startingMinute;
    private int endingHour;
    private int endingMinute;
    private int day;
    private int month;
    private int year;

    @Override
    public String identifier() {
        return "definir_date";
    }

    @Override
    public void execute() {
        Date date = new Date();
        Timeslot timeslut = new Timeslot();

        date.setDay(day);
        date.setMonth(month);
        date.setYear(year);

        timeslut.setStartingHour(startingHour);
        timeslut.setStartingMinute(startingMinute);
        timeslut.setEndingHour(endingHour);
        timeslut.setEndingMinute(endingMinute);

        shell.system.organisation.setDateOfCeremony(date, timeslut);
    }

    @Override
    public void load(List<String> args) {
        day = tryParse(args.get(0));
        month = tryParse(args.get(1));
        year = tryParse(args.get(2));
        startingHour = tryParse(args.get(3));
        startingMinute = tryParse(args.get(4));
        endingHour = tryParse(args.get(5));
        endingMinute = tryParse(args.get(6));
    }

    @Override
    public String describe() {
        return "Définir une date et les horaires de la cérémonie (definir_date JOUR MOIS ANNEE HEURE_DEBUT MINUTE_DEBUT HEURE_FIN MINUTE_FIN)";
    }
}

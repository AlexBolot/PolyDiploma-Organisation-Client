package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Date;

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

    }

    @Override
    public String describe() {
        return "Definir une date and les horaires de la cerenomy (date JOUR MOIS ANNEE HEURE_DE_DEBUT MINUTE_DE_DEBUT HEURE_DE_FIN MINUTE_DE_FIN)";
    }
}

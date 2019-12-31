package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Date;

public class GetDeliveryDate extends Command<PolydiplomaOrganisationPublicAPI> {
    @Override
    public String identifier() {
        return "livraison_diplomes";
    }

    @Override
    public void execute() {
        try {

            Date date = shell.system.organisation.getDeliveryDate();
            String dateString = date.getDay() + "/" + date.getMonth() + "/" + date.getYear();
            log("La date de livraison des diplômes est le " + dateString);

        } catch (Exception e) {
            log("Erreur pendant la demande de livraison : " + errorMessage(e.getMessage()));
        }
    }

    @Override
    public String describe() {
        return "Retourne la date de livraison des diplômes";
    }
}

package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Date;

public class GetDeliveryDate extends Command<PolydiplomaOrganisationPublicAPI> {
    @Override
    public String identifier() {
        return "livraison";
    }

    @Override
    public void execute() throws Exception {
        Date date = shell.system.organisation.getDeliveryDate();
        System.out.println("    La date de livraison des diplômes est le " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear() + ".");
    }

    @Override
    public String describe() {
        return "Retourne la date de livraison des diplômes";
    }
}

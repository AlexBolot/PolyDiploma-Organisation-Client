package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;

public class Total extends Command<PolydiplomaOrganisationPublicAPI> {
    @Override
    public String identifier() {
        return "total";
    }

    @Override
    public void execute() {
        int nb = shell.system.organisation.getParticipantList().size();
        log("Il y a " + nb + " participant" + (nb > 1 ? "s" : ""));
    }

    @Override
    public String describe() {
        return "Donne le total de participants";
    }
}

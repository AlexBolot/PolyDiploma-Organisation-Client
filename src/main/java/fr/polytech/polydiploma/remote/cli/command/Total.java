package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;

public class Total extends Command<PolydiplomaOrganisationPublicAPI> {
    @Override
    public String identifier() {
        return "total";
    }

    @Override
    public void execute() throws Exception {
        int nb = shell.system.organisation.getParticipantList().size();
        System.out.println("    Il y a " + nb + " de participant" + (nb > 1 ? "s" : ""));
    }

    @Override
    public String describe() {
        return "Donne le total de participant";
    }
}

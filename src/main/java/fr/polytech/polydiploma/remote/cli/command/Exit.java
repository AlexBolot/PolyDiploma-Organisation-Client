package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;

public class Exit extends Command<PolydiplomaOrganisationPublicAPI> {

    @Override
    public String identifier() { return "quitter"; }

    @Override
    public void execute() { }

    @Override
    public String describe() {
        return "Quitter Polydiploma";
    }

    @Override
    public boolean shouldContinue() { return false; }

}

package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;

public class InviteGraduate extends Command<PolydiplomaOrganisationPublicAPI> {

    @Override
    public String identifier() {
        return "etudiant";
    }

    @Override
    public void execute() throws Exception {
        shell.system.organisation.inviteGraduates();
    }


    @Override
    public String describe() {
        return "Invite tous les étudiants de l'année qui peuvent être diplômés";
    }
}

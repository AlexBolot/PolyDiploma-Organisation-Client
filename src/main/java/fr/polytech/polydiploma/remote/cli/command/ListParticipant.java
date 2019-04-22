package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Participant;

import java.util.List;

public class ListParticipant extends Command<PolydiplomaOrganisationPublicAPI> {

    @Override
    public String identifier() {
        return "lister";
    }

    @Override
    public void execute() throws Exception {
        List<Participant> participants = shell.system.organisation.getParticipantList();
        if (participants.isEmpty()) {
            System.out.println("    Il n'y a pas de participant pour cette remise des diplômes");
        } else {
            for (Participant participant : participants) {
                System.out.println("    " + participant.getFirstname() + " " + participant.getLastname());
            }
        }
    }

    @Override
    public String describe() {
        return "Donne la liste de tout les participant";
    }
}

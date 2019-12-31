package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Participant;

import java.util.List;

public class ListParticipant extends Command<PolydiplomaOrganisationPublicAPI> {

    @Override
    public String identifier() {
        return "liste_participants";
    }

    @Override
    public void execute() {
        List<Participant> participants = shell.system.organisation.getParticipantList();

        if (participants.isEmpty())
            log("Il n'y a pas de participant pour cette remise des diplômes");
        else
            participants.stream().map(participant -> participant.getFirstname() + " " + participant.getLastname()).forEach(this::log);
    }

    @Override
    public String describe() {
        return "Donne la liste de tous les participants";
    }
}

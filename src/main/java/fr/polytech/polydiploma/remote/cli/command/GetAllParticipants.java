package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Participant;

import java.util.List;

public class GetAllParticipants extends Command<PolydiplomaOrganisationPublicAPI> {

    @Override
    public String identifier() {
        return "recupere_tous_participants";
    }

    @Override
    public void execute() throws Exception {
        List<Participant> participants = shell.system.organisation.getAllParticipant();
        if (participants.isEmpty())
            log("Il n'y a pas de participant pour cette remise des diplômes");
        else
            participants.stream().map(participant -> participant.getFirstname() + " " + participant.getLastname()).forEach(this::log);
    }

    @Override
    public String describe() {
        return "Recupere tous les participants qui ont été invités";
    }
}

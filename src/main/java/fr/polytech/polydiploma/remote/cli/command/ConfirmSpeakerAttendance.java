package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Speaker;

import java.util.List;

public class ConfirmSpeakerAttendance extends Command<PolydiplomaOrganisationPublicAPI> {

    private String firstname;
    private String lastname;
    private String mail;

    @Override
    public String identifier() {
        return "confirmer";
    }

    @Override
    public void execute() throws Exception {
        Speaker speaker = new Speaker();
        speaker.setFirstname(firstname);
        speaker.setLastname(lastname);
        speaker.setMail(mail);

        shell.system.organisation.confirmSpeakerAttendance(speaker);
    }

    @Override
    public void load(List<String> args) {
        firstname = args.get(0);
        lastname = args.get(1);
        mail = args.get(2);
    }

    @Override
    public String describe() {
        return "Confirme la présence d'un vip a la cérémonie (confirmer PRENOM NOM MAIL)";
    }
}

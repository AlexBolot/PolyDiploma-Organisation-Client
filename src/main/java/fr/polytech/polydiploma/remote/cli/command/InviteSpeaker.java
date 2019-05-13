package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Speaker;
import fr.polytech.polydiploma.remote.stubs.Timeslot;

import java.util.List;

public class InviteSpeaker extends Command<PolydiplomaOrganisationPublicAPI> {

    private String firstname;
    private String lastname;
    private String mail;

    @Override
    public String identifier() {
        return "inviter_VIP";
    }

    @Override
    public void execute() throws Exception {
        Speaker speaker = new Speaker();
        speaker.setFirstname(firstname);
        speaker.setLastname(lastname);
        speaker.setMail(mail);

        if (shell.system.organisation.inviteSpeaker(speaker))
            log("Le VIP " + speaker.getFirstname() + " " + speaker.getLastname() + " a bien été invité avec cette adresse mail : " + speaker.getMail());
        else
            log("Il y a eu un problème le VIP n'a pas été invité");
    }

    @Override
    public void load(List<String> args) {
        firstname = args.get(0);
        lastname = args.get(1);
        mail = args.get(2);
    }

    @Override
    public String describe() {
        return "Invite un intervenant VIP (inviter_VIP PRENOM NOM EMAIL)";
    }
}

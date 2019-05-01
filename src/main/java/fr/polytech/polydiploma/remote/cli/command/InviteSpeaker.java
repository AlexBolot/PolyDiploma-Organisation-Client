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
    private String startingHour;
    private String startingMinute;
    private String endingHour;
    private String endingMinute;

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

        Timeslot timeslot = new Timeslot();
        timeslot.setStartingHour(tryParse(startingHour));
        timeslot.setStartingMinute(tryParse(startingMinute));
        timeslot.setEndingHour(tryParse(endingHour));
        timeslot.setEndingMinute(tryParse(endingMinute));

        shell.system.organisation.addSpeaker(speaker, timeslot);
    }

    @Override
    public void load(List<String> args) {
        firstname = args.get(0);
        lastname = args.get(1);
        mail = args.get(2);
        startingHour = args.get(3);
        startingMinute = args.get(4);
        endingHour = args.get(5);
        endingMinute = args.get(6);
    }

    @Override
    public String describe() {
        return "Invite un intervenant VIP (inviter_VIP PRENOM NOM EMAIL HEURE_DEBUT MINUTE_DEBUT HEURE_FIN MINUTE_FIN)";
    }
}

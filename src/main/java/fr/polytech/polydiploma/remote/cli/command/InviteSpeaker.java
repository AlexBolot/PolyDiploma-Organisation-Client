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
        return "vip";
    }

    @Override
    public void execute() throws Exception {
        Speaker speaker = new Speaker();
        speaker.setFirstname(firstname);
        speaker.setLastname(lastname);
        speaker.setMail(mail);

        Timeslot timeslot = new Timeslot();
        timeslot.setStartingHour(Integer.parseInt(startingHour));
        timeslot.setStartingMinute(Integer.parseInt(startingMinute));
        timeslot.setEndingHour(Integer.parseInt(endingHour));
        timeslot.setEndingMinute(Integer.parseInt(endingMinute));

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
        return "Invite un intervenant VIP (vip PRENOM NOM EMAIL HEURE_DE_DEBUT MINUTE_DE_DEBUT HEURE_DE_FIN MINUTE_DE_FIN)";
    }
}

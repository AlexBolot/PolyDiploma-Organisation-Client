package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Graduate;
import fr.polytech.polydiploma.remote.stubs.Guest;

import java.util.List;

public class GetGuestFromGraduate extends Command<PolydiplomaOrganisationPublicAPI> {

    private String mail;

    @Override
    public String identifier() {
        return "recupere_inviter";
    }

    @Override
    public void execute() throws Exception {
        List<Guest> guests = shell.system.organisation.getGuestFromGraduate(mail);

        if (guests.isEmpty())
            log("Il n'y a pas d'invité pour cette étudiant");
        else {
            for (Guest g : guests) {
                log(g.getFirstname() + " " + g.getLastname() + " : " + (g.isPayingGuest() ? (g.isHasPayed() ? "a payé" : "n'a pas payé") : "venue gratuite"));
            }
        }
//        guests.stream().map(guest -> guest.getFirstname() + " " + guest.getLastname()).forEach(this::log);
    }

    @Override
    public void load(List<String> args) {
        mail = args.get(0);
    }

    @Override
    public String describe() {
        return "Recupere des inviter a partir d'un étudiant (recupere_inviter MAIL_ETUDIANT)";
    }
}

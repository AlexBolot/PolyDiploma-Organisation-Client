package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Graduate;
import fr.polytech.polydiploma.remote.stubs.Guest;

import java.util.List;

public class GetGuestFromGraduate extends Command<PolydiplomaOrganisationPublicAPI> {

    private String firstname;
    private String lastname;
    private String mail;

    @Override
    public String identifier() {
        return "recupere_inviter";
    }

    @Override
    public void execute() throws Exception {
        Graduate graduate = new Graduate();
        graduate.setFirstname(firstname);
        graduate.setLastname(lastname);
        graduate.setMail(mail);

        List<Guest> guests = shell.system.organisation.getGuestFromGraduate(graduate);

        if (guests.isEmpty())
            log("Il n'y a pas d'invité pour cette étudiant");
        else
            guests.stream().map(guest -> guest.getFirstname() + " " + guest.getLastname()).forEach(this::log);
    }

    @Override
    public String describe() {
        return "Recupere des inviter a partir d'un étudiant (recupere_inviter NOM_ETUDIANT PRENOM_ETUDIANT MAIL_ETUDIANT)";
    }
}

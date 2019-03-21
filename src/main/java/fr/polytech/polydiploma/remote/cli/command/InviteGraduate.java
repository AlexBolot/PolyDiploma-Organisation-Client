package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.Graduate;

import java.util.List;

public class InviteGraduate extends Command<PolydiplomaOrganisationPublicAPI> {

    private String firstname;
    private String lastname;
    private String mail;

    @Override
    public String identifier() {
        return "etudiant";
    }

    @Override
    public void execute() throws Exception {
        Graduate graduate = new Graduate();
        graduate.setFirstname(firstname);
        graduate.setLastname(lastname);
        graduate.setMail(mail);
    }

    @Override
    public void load(List<String> args) {
        firstname = args.get(0);
        lastname = args.get(1);
        mail = args.get(2);
    }

    @Override
    public String describe() {
        return "Invite un étudiant (etudiant PRENOM NOM EMAIL)";
    }
}

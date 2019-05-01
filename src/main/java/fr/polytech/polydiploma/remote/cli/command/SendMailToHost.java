package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;

import java.util.List;

public class SendMailToHost extends Command<PolydiplomaOrganisationPublicAPI> {

    private String hostMail;

    @Override
    public String identifier() {
        return "mail";
    }

    @Override
    public void execute() throws Exception {
        shell.system.organisation.sendMailToHost(hostMail);
    }

    @Override
    public void load(List<String> args) {
        this.hostMail = args.get(0);
    }

    @Override
    public String describe() {
        return "Envoie un mail pour reservé la salle et indique le nombre de participants (mail MAIL_DU_PROPRIETAIRE)";
    }
}

package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;

import java.util.List;

public class SendMailToHost extends Command<PolydiplomaOrganisationPublicAPI> {

    private String hostMail;

    @Override
    public String identifier() {
        return "reserver_ceremonie";
    }

    @Override
    public void execute() throws Exception {
        if (shell.system.organisation.sendMail(hostMail))
            log("Le mail pour réserver la salle de cérénomi a bien été envoyé à " + hostMail);
        else
            log("Il y a eu une erreur lors de l'envoi du mail");
    }

    @Override
    public void load(List<String> args) {
        this.hostMail = args.get(0);
    }

    @Override
    public String describe() {
        return "Envoie un mail pour reserver la salle et indique le nombre de participants (reserver_ceremonie MAIL_DU_PROPRIETAIRE)";
    }
}

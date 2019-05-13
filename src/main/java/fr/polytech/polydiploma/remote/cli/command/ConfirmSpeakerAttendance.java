package fr.polytech.polydiploma.remote.cli.command;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.framework.Command;
import fr.polytech.polydiploma.remote.stubs.ExternalPartnerException_Exception;
import fr.polytech.polydiploma.remote.stubs.Speaker;
import fr.polytech.polydiploma.remote.stubs.Timeslot;
import fr.polytech.polydiploma.remote.stubs.TimeslotOverlapException_Exception;

import java.util.List;

public class ConfirmSpeakerAttendance extends Command<PolydiplomaOrganisationPublicAPI> {

    private String mail;
    private int minuteDebut;
    private int heureDebut;
    private int minuteFin;
    private int heureFin;

    @Override
    public String identifier() {
        return "confirmer_presence";
    }

    @Override
    public void execute() {
        Timeslot timeslot = new Timeslot();
        timeslot.setStartingMinute(minuteDebut);
        timeslot.setStartingHour(heureDebut);
        timeslot.setEndingMinute(minuteFin);
        timeslot.setEndingHour(heureFin);

        try {
            if (shell.system.organisation.confirmSpeakerAttendance(mail, timeslot))
                log("La présence du VIP est confirmé");
            else
                log("il y a eu un probleme la confimation de la venue du VIP n'a pas être éffectuer");
        } catch (ExternalPartnerException_Exception e) {
            log("Le(s) service(s) externe(s) ne fonctionne pas : " + e.getMessage());
        } catch (TimeslotOverlapException_Exception e) {
            log("Le creneau empiette sur un autre : " + e.getMessage());
        }
    }

    @Override
    public void load(List<String> args) {
        mail = args.get(0);
        heureDebut = tryParse(args.get(1));
        minuteDebut = tryParse(args.get(2));
        heureFin = tryParse(args.get(3));
        minuteFin = tryParse(args.get(4));
    }

    @Override
    public String describe() {
        return "Confirme la présence d'un vip à la cérémonie (confirmer_presence MAIL HEURE_DEBUT MINUTE_DEBUT HEURE_FIN MINUTE_FIN)";
    }
}

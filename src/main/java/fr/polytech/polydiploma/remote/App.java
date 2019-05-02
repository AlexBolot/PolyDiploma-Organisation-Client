package fr.polytech.polydiploma.remote;

import fr.polytech.polydiploma.remote.api.PolydiplomaOrganisationPublicAPI;
import fr.polytech.polydiploma.remote.cli.command.*;
import fr.polytech.polydiploma.remote.cli.framework.Shell;

public class App extends Shell<PolydiplomaOrganisationPublicAPI> {

    public App(String host, String port) {

        this.system  = new PolydiplomaOrganisationPublicAPI(host, port);
        this.invite  = "Organisation CLI";

        // Registering the command available for the user
        register(
                Exit.class,
                DisplayPlanning.class,
                InviteGraduate.class,
                InviteSpeaker.class,
                Total.class,
                ListParticipant.class,
                SetDateAndHour.class,
                GetDeliveryDate.class,
                Play.class,
                SetFieldTimeslot.class,
                GetFields.class,
                ConfirmSpeakerAttendance.class,
                SendMailToHost.class
        );
    }

    public static void main(String[] args) {
        String host = ( args.length == 0 ? "localhost" : args[0] );
        String port = ( args.length < 2  ? "8082"      : args[1] );
        System.out.println("\n\nLancement du client pour l'organisation de Polydiploma");
        System.out.println("  - Serveur distant: " + host);
        System.out.println("  - Numéro de port:  " + port);
        App app = new App(host, port);
        app.run();
        System.out.println("Sortie du client pour l'organisation de Polydiploma\n\n");
    }
}

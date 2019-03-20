package fr.polytech.polydiploma;

import fr.polytech.polydiploma.entities.Timeslot;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.util.logging.Logger;

@ManagedBean
@SessionScoped
public class ParticipantBean {

    @EJB private transient ManageParticipants manageParticipants;
    @EJB private transient PlanningUpdater planningUpdater;

    private static final Logger log = Logger.getLogger(GraduateBean.class.getName());

    private String firstname;
    private String lastname;
    private String email;
    private String timeslotId;

    public String getFirstName() { return firstname; }
    public void setFirstName(String firstname) { this.firstname = firstname; }

    public String getLastName() { return lastname; }
    public void setLastName(String lastname) { this.lastname = lastname; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTimeslotId() { return timeslotId; }
    public void setTimeslotId(String timeslotId) { this.timeslotId = timeslotId; }

    public String validate() {
        Timeslot timeslot = new Timeslot();
        timeslot.setStartingHour(4);
        timeslot.setStartingMinute(20);
        timeslot.setEndingHour(5);
        timeslot.setEndingMinute(0);
        Speaker speaker = new Speaker();
        speaker.setFirstname(getFirstName());
        speaker.setLastname(getLastName());
        speaker.setMail(getEmail());
        speaker.setId(5L);

        manageParticipants.inviteSpeaker(speaker);

        try {
            planningUpdater.addTimeslot(timeslot, speaker);
        } catch (Exception e) {
            FacesContext.getCurrentInstance()
                    .addMessage("form-error", new FacesMessage("Couldn't send mail!"));
        }
//        FacesContext.getCurrentInstance()
//                .addMessage("form-error", new FacesMessage("VIP " + getFirstName() + " " + getLastName() + " was assign to a timeslot number " + getTimeslotId() + "!"));
        return "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    }

    /**
     * Invoqued when the "Display Participants" button is pushed
     */
    public String seeParticipants() {
        System.out.println("Tu m'as appuyé dessus");
        FacesContext.getCurrentInstance()
                .addMessage("form-success",
                        new FacesMessage(manageParticipants.requireParticipants().toString()));
        return "Heyheyhey";
    }

}

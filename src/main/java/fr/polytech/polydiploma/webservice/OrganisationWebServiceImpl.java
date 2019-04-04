package fr.polytech.polydiploma.webservice;

import fr.polytech.polydiploma.*;
import fr.polytech.polydiploma.entities.*;
import fr.polytech.polydiploma.exceptions.ExternalPartnerException;
import fr.polytech.polydiploma.exceptions.TimeslotOverlapException;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.List;
import java.util.logging.Logger;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation")
@Stateless(name = "OrganisationWS")
public class OrganisationWebServiceImpl implements OrganisationWebService {


    private static final Logger log = Logger.getLogger(OrganisationWebServiceImpl.class.getName());


    @EJB private transient ManageParticipants manageParticipants;
    @EJB private transient PlanningUpdater planningUpdater;
    @EJB private transient GraduatesValidation graduatesValidation;

    @Override
    public void addSpeaker(Speaker speaker, Timeslot timeslot) throws ExternalPartnerException, TimeslotOverlapException {
        planningUpdater.addTimeslot(timeslot, speaker);
        manageParticipants.inviteSpeaker(speaker);
    }

    @Override
    public void inviteGraduates() throws ExternalPartnerException {
        graduatesValidation.inviteGraduates();
    }


    @Override
    public void setDateOfCerenomy(Date date, Timeslot timeslot) {
        planningUpdater.setCeremonySlot(date, timeslot);
        log.info("Ceremony date is set");
    }

    @Override
    public Date getDeliveryDate() throws ExternalPartnerException {
        return graduatesValidation.requireDeliveryDate();
    }

    @Override
    public List<Participant> getParticipantList() {
        return manageParticipants.requireParticipants();
    }

    @Override
    public Planning getPlanning() {
        return planningUpdater.getPlanning();
    }
}

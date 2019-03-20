package fr.polytech.polydiploma.webservice;

import fr.polytech.polydiploma.*;
import fr.polytech.polydiploma.entities.Planning;
import fr.polytech.polydiploma.entities.Timeslot;
import fr.polytech.polydiploma.exceptions.ExternalPartnerException;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/plydiploma/organisation")
@Stateless(name = "OrganisationWS")
public class OrganisationWebServiceImpl implements OrganisationWebService {

    @EJB private transient ManageParticipants manageParticipants;
    @EJB private transient PlanningUpdater planningUpdater;

    @Override
    public void addSpeaker(Speaker speaker, Timeslot timeslot) throws ExternalPartnerException {
        planningUpdater.addTimeslot(timeslot, speaker);
        manageParticipants.inviteSpeaker(speaker);
    }

    @Override
    public void addGraduate(Graduate graduate) {
        manageParticipants.inviteExpected(graduate);
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

package fr.polytech.polydiploma.webservice;

import fr.polytech.polydiploma.entities.Participant;
import fr.polytech.polydiploma.entities.Speaker;
import fr.polytech.polydiploma.entities.Date;
import fr.polytech.polydiploma.entities.Planning;
import fr.polytech.polydiploma.entities.Timeslot;
import fr.polytech.polydiploma.exceptions.ExternalPartnerException;
import fr.polytech.polydiploma.exceptions.TimeslotOverlapException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation")
public interface OrganisationWebService {

    @WebMethod
//    @Interceptors({ExpectedVerifier.class})
    void addSpeaker(@WebParam(name = "speaker") Speaker speaker,
                    @WebParam(name = "timeslot") Timeslot timeslot) throws ExternalPartnerException, TimeslotOverlapException;

    @WebMethod
    void inviteGraduates() throws ExternalPartnerException;

    @WebMethod
//    @Interceptors({ExpectedVerifier.class})
    void setDateOfCerenomy(@WebParam(name = "date") Date date,
                     @WebParam(name = "timeslot") Timeslot timeslot);

    @WebMethod
    @WebResult(name = "delivery_date")
    Date getDeliveryDate() throws ExternalPartnerException;

    @WebMethod
    @WebResult(name = "participant_list")
    List<Participant> getParticipantList();

    @WebMethod
    @WebResult(name = "planning")
    Planning getPlanning();

}

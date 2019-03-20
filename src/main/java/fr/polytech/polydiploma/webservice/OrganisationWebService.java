package fr.polytech.polydiploma.webservice;

import fr.polytech.polydiploma.Graduate;
import fr.polytech.polydiploma.Participant;
import fr.polytech.polydiploma.Speaker;
import fr.polytech.polydiploma.entities.Planning;
import fr.polytech.polydiploma.entities.Timeslot;
import fr.polytech.polydiploma.exceptions.ExternalPartnerException;
import fr.polytech.polydiploma.interceptor.ExpectedVerifier;

import javax.interceptor.Interceptors;
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
                    @WebParam(name = "timeslot") Timeslot timeslot) throws ExternalPartnerException;

    @WebMethod
//    @Interceptors({ExpectedVerifier.class})
    void addGraduate(@WebParam(name = "graduate") Graduate graduate);

    @WebMethod
    @WebResult(name = "participant_list")
    List<Participant> getParticipantList();

    @WebMethod
    @WebResult(name = "planning")
    Planning getPlanning();

}

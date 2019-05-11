package fr.polytech.polydiploma.remote.stubs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2019-05-11T22:54:05.651+02:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "OrganisationWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface OrganisationWebService {

    @WebMethod
    @RequestWrapper(localName = "getFreeTimeslot", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetFreeTimeslot")
    @ResponseWrapper(localName = "getFreeTimeslotResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetFreeTimeslotResponse")
    @WebResult(name = "free_timeslot", targetNamespace = "")
    public java.util.List<fr.polytech.polydiploma.remote.stubs.Timeslot> getFreeTimeslot();

    @WebMethod
    @RequestWrapper(localName = "setFieldTimeslot", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.SetFieldTimeslot")
    @ResponseWrapper(localName = "setFieldTimeslotResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.SetFieldTimeslotResponse")
    public void setFieldTimeslot(
        @WebParam(name = "field", targetNamespace = "")
        fr.polytech.polydiploma.remote.stubs.Field field,
        @WebParam(name = "timeslot", targetNamespace = "")
        fr.polytech.polydiploma.remote.stubs.Timeslot timeslot
    ) throws TimeslotOverlapException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getAllParticipant", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetAllParticipant")
    @ResponseWrapper(localName = "getAllParticipantResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetAllParticipantResponse")
    @WebResult(name = "all_participant_list", targetNamespace = "")
    public java.util.List<fr.polytech.polydiploma.remote.stubs.Participant> getAllParticipant();

    @WebMethod
    @RequestWrapper(localName = "sendMail", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.SendMail")
    @ResponseWrapper(localName = "sendMailResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.SendMailResponse")
    @WebResult(name = "send_success", targetNamespace = "")
    public boolean sendMail(
        @WebParam(name = "host_mail", targetNamespace = "")
        java.lang.String hostMail
    ) throws ExternalPartnerException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getSpeakerTimeslot", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetSpeakerTimeslot")
    @ResponseWrapper(localName = "getSpeakerTimeslotResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetSpeakerTimeslotResponse")
    @WebResult(name = "speaker_timeslot", targetNamespace = "")
    public fr.polytech.polydiploma.remote.stubs.GetSpeakerTimeslotResponse.SpeakerTimeslot getSpeakerTimeslot();

    @WebMethod
    @RequestWrapper(localName = "getDeliveryDate", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetDeliveryDate")
    @ResponseWrapper(localName = "getDeliveryDateResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetDeliveryDateResponse")
    @WebResult(name = "delivery_date", targetNamespace = "")
    public fr.polytech.polydiploma.remote.stubs.Date getDeliveryDate() throws ExternalPartnerException_Exception;

    @WebMethod
    @RequestWrapper(localName = "setDateOfCeremony", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.SetDateOfCeremony")
    @ResponseWrapper(localName = "setDateOfCeremonyResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.SetDateOfCeremonyResponse")
    public void setDateOfCeremony(
        @WebParam(name = "date", targetNamespace = "")
        fr.polytech.polydiploma.remote.stubs.Date date,
        @WebParam(name = "timeslot", targetNamespace = "")
        fr.polytech.polydiploma.remote.stubs.Timeslot timeslot
    );

    @WebMethod
    @RequestWrapper(localName = "inviteSpeaker", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.InviteSpeaker")
    @ResponseWrapper(localName = "inviteSpeakerResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.InviteSpeakerResponse")
    public void inviteSpeaker(
        @WebParam(name = "speaker", targetNamespace = "")
        fr.polytech.polydiploma.remote.stubs.Speaker speaker
    ) throws ExternalPartnerException_Exception, SpeakerAlreadyExistException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getParticipantList", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetParticipantList")
    @ResponseWrapper(localName = "getParticipantListResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetParticipantListResponse")
    @WebResult(name = "participant_list", targetNamespace = "")
    public java.util.List<fr.polytech.polydiploma.remote.stubs.Participant> getParticipantList();

    @WebMethod
    @RequestWrapper(localName = "inviteGraduates", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.InviteGraduates")
    @ResponseWrapper(localName = "inviteGraduatesResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.InviteGraduatesResponse")
    public void inviteGraduates() throws ExternalPartnerException_Exception, SpeakerAlreadyExistException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getFieldTimeslot", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetFieldTimeslot")
    @ResponseWrapper(localName = "getFieldTimeslotResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetFieldTimeslotResponse")
    @WebResult(name = "field_timeslot", targetNamespace = "")
    public fr.polytech.polydiploma.remote.stubs.GetFieldTimeslotResponse.FieldTimeslot getFieldTimeslot();

    @WebMethod
    @RequestWrapper(localName = "getPlanning", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetPlanning")
    @ResponseWrapper(localName = "getPlanningResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetPlanningResponse")
    @WebResult(name = "planning", targetNamespace = "")
    public fr.polytech.polydiploma.remote.stubs.Planning getPlanning();

    @WebMethod
    @RequestWrapper(localName = "confirmSpeakerAttendance", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.ConfirmSpeakerAttendance")
    @ResponseWrapper(localName = "confirmSpeakerAttendanceResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.ConfirmSpeakerAttendanceResponse")
    public void confirmSpeakerAttendance(
        @WebParam(name = "mail", targetNamespace = "")
        java.lang.String mail,
        @WebParam(name = "timeslot", targetNamespace = "")
        fr.polytech.polydiploma.remote.stubs.Timeslot timeslot
    ) throws ExternalPartnerException_Exception, TimeslotOverlapException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getFields", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetFields")
    @ResponseWrapper(localName = "getFieldsResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetFieldsResponse")
    @WebResult(name = "field_list", targetNamespace = "")
    public java.util.List<fr.polytech.polydiploma.remote.stubs.Field> getFields();

    @WebMethod
    @RequestWrapper(localName = "getGuestFromGraduate", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetGuestFromGraduate")
    @ResponseWrapper(localName = "getGuestFromGraduateResponse", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", className = "fr.polytech.polydiploma.remote.stubs.GetGuestFromGraduateResponse")
    @WebResult(name = "guest_list", targetNamespace = "")
    public java.util.List<fr.polytech.polydiploma.remote.stubs.Guest> getGuestFromGraduate(
        @WebParam(name = "email", targetNamespace = "")
        java.lang.String email
    );
}

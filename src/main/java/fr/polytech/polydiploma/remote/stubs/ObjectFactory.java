
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.polytech.polydiploma.remote.stubs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddSpeaker_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "addSpeaker");
    private final static QName _AddSpeakerResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "addSpeakerResponse");
    private final static QName _ConfirmSpeakerAttendance_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "confirmSpeakerAttendance");
    private final static QName _ConfirmSpeakerAttendanceResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "confirmSpeakerAttendanceResponse");
    private final static QName _GetAllParticipant_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getAllParticipant");
    private final static QName _GetAllParticipantResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getAllParticipantResponse");
    private final static QName _GetDeliveryDate_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getDeliveryDate");
    private final static QName _GetDeliveryDateResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getDeliveryDateResponse");
    private final static QName _GetFields_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getFields");
    private final static QName _GetFieldsResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getFieldsResponse");
    private final static QName _GetGuestFromGraduate_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getGuestFromGraduate");
    private final static QName _GetGuestFromGraduateResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getGuestFromGraduateResponse");
    private final static QName _GetParticipantList_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getParticipantList");
    private final static QName _GetParticipantListResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getParticipantListResponse");
    private final static QName _GetPlanning_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getPlanning");
    private final static QName _GetPlanningResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getPlanningResponse");
    private final static QName _InviteGraduates_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "inviteGraduates");
    private final static QName _InviteGraduatesResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "inviteGraduatesResponse");
    private final static QName _SendMail_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "sendMail");
    private final static QName _SendMailResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "sendMailResponse");
    private final static QName _SetDateOfCeremony_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "setDateOfCeremony");
    private final static QName _SetDateOfCeremonyResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "setDateOfCeremonyResponse");
    private final static QName _SetFieldTimeslot_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "setFieldTimeslot");
    private final static QName _SetFieldTimeslotResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "setFieldTimeslotResponse");
    private final static QName _TimeslotOverlapException_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "TimeslotOverlapException");
    private final static QName _ExternalPartnerException_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "ExternalPartnerException");
    private final static QName _SpeakerAlreadyExistException_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "SpeakerAlreadyExistException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.polytech.polydiploma.remote.stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddSpeaker }
     * 
     */
    public AddSpeaker createAddSpeaker() {
        return new AddSpeaker();
    }

    /**
     * Create an instance of {@link AddSpeakerResponse }
     * 
     */
    public AddSpeakerResponse createAddSpeakerResponse() {
        return new AddSpeakerResponse();
    }

    /**
     * Create an instance of {@link ConfirmSpeakerAttendance }
     * 
     */
    public ConfirmSpeakerAttendance createConfirmSpeakerAttendance() {
        return new ConfirmSpeakerAttendance();
    }

    /**
     * Create an instance of {@link ConfirmSpeakerAttendanceResponse }
     * 
     */
    public ConfirmSpeakerAttendanceResponse createConfirmSpeakerAttendanceResponse() {
        return new ConfirmSpeakerAttendanceResponse();
    }

    /**
     * Create an instance of {@link GetAllParticipant }
     * 
     */
    public GetAllParticipant createGetAllParticipant() {
        return new GetAllParticipant();
    }

    /**
     * Create an instance of {@link GetAllParticipantResponse }
     * 
     */
    public GetAllParticipantResponse createGetAllParticipantResponse() {
        return new GetAllParticipantResponse();
    }

    /**
     * Create an instance of {@link GetDeliveryDate }
     * 
     */
    public GetDeliveryDate createGetDeliveryDate() {
        return new GetDeliveryDate();
    }

    /**
     * Create an instance of {@link GetDeliveryDateResponse }
     * 
     */
    public GetDeliveryDateResponse createGetDeliveryDateResponse() {
        return new GetDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link GetFields }
     * 
     */
    public GetFields createGetFields() {
        return new GetFields();
    }

    /**
     * Create an instance of {@link GetFieldsResponse }
     * 
     */
    public GetFieldsResponse createGetFieldsResponse() {
        return new GetFieldsResponse();
    }

    /**
     * Create an instance of {@link GetGuestFromGraduate }
     * 
     */
    public GetGuestFromGraduate createGetGuestFromGraduate() {
        return new GetGuestFromGraduate();
    }

    /**
     * Create an instance of {@link GetGuestFromGraduateResponse }
     * 
     */
    public GetGuestFromGraduateResponse createGetGuestFromGraduateResponse() {
        return new GetGuestFromGraduateResponse();
    }

    /**
     * Create an instance of {@link GetParticipantList }
     * 
     */
    public GetParticipantList createGetParticipantList() {
        return new GetParticipantList();
    }

    /**
     * Create an instance of {@link GetParticipantListResponse }
     * 
     */
    public GetParticipantListResponse createGetParticipantListResponse() {
        return new GetParticipantListResponse();
    }

    /**
     * Create an instance of {@link GetPlanning }
     * 
     */
    public GetPlanning createGetPlanning() {
        return new GetPlanning();
    }

    /**
     * Create an instance of {@link GetPlanningResponse }
     * 
     */
    public GetPlanningResponse createGetPlanningResponse() {
        return new GetPlanningResponse();
    }

    /**
     * Create an instance of {@link InviteGraduates }
     * 
     */
    public InviteGraduates createInviteGraduates() {
        return new InviteGraduates();
    }

    /**
     * Create an instance of {@link InviteGraduatesResponse }
     * 
     */
    public InviteGraduatesResponse createInviteGraduatesResponse() {
        return new InviteGraduatesResponse();
    }

    /**
     * Create an instance of {@link SendMail }
     * 
     */
    public SendMail createSendMail() {
        return new SendMail();
    }

    /**
     * Create an instance of {@link SendMailResponse }
     * 
     */
    public SendMailResponse createSendMailResponse() {
        return new SendMailResponse();
    }

    /**
     * Create an instance of {@link SetDateOfCeremony }
     * 
     */
    public SetDateOfCeremony createSetDateOfCeremony() {
        return new SetDateOfCeremony();
    }

    /**
     * Create an instance of {@link SetDateOfCeremonyResponse }
     * 
     */
    public SetDateOfCeremonyResponse createSetDateOfCeremonyResponse() {
        return new SetDateOfCeremonyResponse();
    }

    /**
     * Create an instance of {@link SetFieldTimeslot }
     * 
     */
    public SetFieldTimeslot createSetFieldTimeslot() {
        return new SetFieldTimeslot();
    }

    /**
     * Create an instance of {@link SetFieldTimeslotResponse }
     * 
     */
    public SetFieldTimeslotResponse createSetFieldTimeslotResponse() {
        return new SetFieldTimeslotResponse();
    }

    /**
     * Create an instance of {@link TimeslotOverlapException }
     * 
     */
    public TimeslotOverlapException createTimeslotOverlapException() {
        return new TimeslotOverlapException();
    }

    /**
     * Create an instance of {@link ExternalPartnerException }
     * 
     */
    public ExternalPartnerException createExternalPartnerException() {
        return new ExternalPartnerException();
    }

    /**
     * Create an instance of {@link SpeakerAlreadyExistException }
     * 
     */
    public SpeakerAlreadyExistException createSpeakerAlreadyExistException() {
        return new SpeakerAlreadyExistException();
    }

    /**
     * Create an instance of {@link Timeslot }
     * 
     */
    public Timeslot createTimeslot() {
        return new Timeslot();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Speaker }
     * 
     */
    public Speaker createSpeaker() {
        return new Speaker();
    }

    /**
     * Create an instance of {@link Planning }
     * 
     */
    public Planning createPlanning() {
        return new Planning();
    }

    /**
     * Create an instance of {@link Graduate }
     * 
     */
    public Graduate createGraduate() {
        return new Graduate();
    }

    /**
     * Create an instance of {@link Guest }
     * 
     */
    public Guest createGuest() {
        return new Guest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSpeaker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "addSpeaker")
    public JAXBElement<AddSpeaker> createAddSpeaker(AddSpeaker value) {
        return new JAXBElement<AddSpeaker>(_AddSpeaker_QNAME, AddSpeaker.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSpeakerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "addSpeakerResponse")
    public JAXBElement<AddSpeakerResponse> createAddSpeakerResponse(AddSpeakerResponse value) {
        return new JAXBElement<AddSpeakerResponse>(_AddSpeakerResponse_QNAME, AddSpeakerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmSpeakerAttendance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "confirmSpeakerAttendance")
    public JAXBElement<ConfirmSpeakerAttendance> createConfirmSpeakerAttendance(ConfirmSpeakerAttendance value) {
        return new JAXBElement<ConfirmSpeakerAttendance>(_ConfirmSpeakerAttendance_QNAME, ConfirmSpeakerAttendance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmSpeakerAttendanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "confirmSpeakerAttendanceResponse")
    public JAXBElement<ConfirmSpeakerAttendanceResponse> createConfirmSpeakerAttendanceResponse(ConfirmSpeakerAttendanceResponse value) {
        return new JAXBElement<ConfirmSpeakerAttendanceResponse>(_ConfirmSpeakerAttendanceResponse_QNAME, ConfirmSpeakerAttendanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllParticipant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "getAllParticipant")
    public JAXBElement<GetAllParticipant> createGetAllParticipant(GetAllParticipant value) {
        return new JAXBElement<GetAllParticipant>(_GetAllParticipant_QNAME, GetAllParticipant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllParticipantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "getAllParticipantResponse")
    public JAXBElement<GetAllParticipantResponse> createGetAllParticipantResponse(GetAllParticipantResponse value) {
        return new JAXBElement<GetAllParticipantResponse>(_GetAllParticipantResponse_QNAME, GetAllParticipantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeliveryDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "getDeliveryDate")
    public JAXBElement<GetDeliveryDate> createGetDeliveryDate(GetDeliveryDate value) {
        return new JAXBElement<GetDeliveryDate>(_GetDeliveryDate_QNAME, GetDeliveryDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeliveryDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "getDeliveryDateResponse")
    public JAXBElement<GetDeliveryDateResponse> createGetDeliveryDateResponse(GetDeliveryDateResponse value) {
        return new JAXBElement<GetDeliveryDateResponse>(_GetDeliveryDateResponse_QNAME, GetDeliveryDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "getFields")
    public JAXBElement<GetFields> createGetFields(GetFields value) {
        return new JAXBElement<GetFields>(_GetFields_QNAME, GetFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFieldsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "getFieldsResponse")
    public JAXBElement<GetFieldsResponse> createGetFieldsResponse(GetFieldsResponse value) {
        return new JAXBElement<GetFieldsResponse>(_GetFieldsResponse_QNAME, GetFieldsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGuestFromGraduate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "getGuestFromGraduate")
    public JAXBElement<GetGuestFromGraduate> createGetGuestFromGraduate(GetGuestFromGraduate value) {
        return new JAXBElement<GetGuestFromGraduate>(_GetGuestFromGraduate_QNAME, GetGuestFromGraduate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGuestFromGraduateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "getGuestFromGraduateResponse")
    public JAXBElement<GetGuestFromGraduateResponse> createGetGuestFromGraduateResponse(GetGuestFromGraduateResponse value) {
        return new JAXBElement<GetGuestFromGraduateResponse>(_GetGuestFromGraduateResponse_QNAME, GetGuestFromGraduateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParticipantList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "getParticipantList")
    public JAXBElement<GetParticipantList> createGetParticipantList(GetParticipantList value) {
        return new JAXBElement<GetParticipantList>(_GetParticipantList_QNAME, GetParticipantList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParticipantListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "getParticipantListResponse")
    public JAXBElement<GetParticipantListResponse> createGetParticipantListResponse(GetParticipantListResponse value) {
        return new JAXBElement<GetParticipantListResponse>(_GetParticipantListResponse_QNAME, GetParticipantListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlanning }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "getPlanning")
    public JAXBElement<GetPlanning> createGetPlanning(GetPlanning value) {
        return new JAXBElement<GetPlanning>(_GetPlanning_QNAME, GetPlanning.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlanningResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "getPlanningResponse")
    public JAXBElement<GetPlanningResponse> createGetPlanningResponse(GetPlanningResponse value) {
        return new JAXBElement<GetPlanningResponse>(_GetPlanningResponse_QNAME, GetPlanningResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InviteGraduates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "inviteGraduates")
    public JAXBElement<InviteGraduates> createInviteGraduates(InviteGraduates value) {
        return new JAXBElement<InviteGraduates>(_InviteGraduates_QNAME, InviteGraduates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InviteGraduatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "inviteGraduatesResponse")
    public JAXBElement<InviteGraduatesResponse> createInviteGraduatesResponse(InviteGraduatesResponse value) {
        return new JAXBElement<InviteGraduatesResponse>(_InviteGraduatesResponse_QNAME, InviteGraduatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "sendMail")
    public JAXBElement<SendMail> createSendMail(SendMail value) {
        return new JAXBElement<SendMail>(_SendMail_QNAME, SendMail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "sendMailResponse")
    public JAXBElement<SendMailResponse> createSendMailResponse(SendMailResponse value) {
        return new JAXBElement<SendMailResponse>(_SendMailResponse_QNAME, SendMailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDateOfCeremony }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "setDateOfCeremony")
    public JAXBElement<SetDateOfCeremony> createSetDateOfCeremony(SetDateOfCeremony value) {
        return new JAXBElement<SetDateOfCeremony>(_SetDateOfCeremony_QNAME, SetDateOfCeremony.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDateOfCeremonyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "setDateOfCeremonyResponse")
    public JAXBElement<SetDateOfCeremonyResponse> createSetDateOfCeremonyResponse(SetDateOfCeremonyResponse value) {
        return new JAXBElement<SetDateOfCeremonyResponse>(_SetDateOfCeremonyResponse_QNAME, SetDateOfCeremonyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFieldTimeslot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "setFieldTimeslot")
    public JAXBElement<SetFieldTimeslot> createSetFieldTimeslot(SetFieldTimeslot value) {
        return new JAXBElement<SetFieldTimeslot>(_SetFieldTimeslot_QNAME, SetFieldTimeslot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFieldTimeslotResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "setFieldTimeslotResponse")
    public JAXBElement<SetFieldTimeslotResponse> createSetFieldTimeslotResponse(SetFieldTimeslotResponse value) {
        return new JAXBElement<SetFieldTimeslotResponse>(_SetFieldTimeslotResponse_QNAME, SetFieldTimeslotResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeslotOverlapException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "TimeslotOverlapException")
    public JAXBElement<TimeslotOverlapException> createTimeslotOverlapException(TimeslotOverlapException value) {
        return new JAXBElement<TimeslotOverlapException>(_TimeslotOverlapException_QNAME, TimeslotOverlapException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalPartnerException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "ExternalPartnerException")
    public JAXBElement<ExternalPartnerException> createExternalPartnerException(ExternalPartnerException value) {
        return new JAXBElement<ExternalPartnerException>(_ExternalPartnerException_QNAME, ExternalPartnerException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpeakerAlreadyExistException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "SpeakerAlreadyExistException")
    public JAXBElement<SpeakerAlreadyExistException> createSpeakerAlreadyExistException(SpeakerAlreadyExistException value) {
        return new JAXBElement<SpeakerAlreadyExistException>(_SpeakerAlreadyExistException_QNAME, SpeakerAlreadyExistException.class, null, value);
    }

}

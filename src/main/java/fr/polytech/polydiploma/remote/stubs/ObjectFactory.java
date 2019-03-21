
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

    private final static QName _AddGraduate_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "addGraduate");
    private final static QName _AddGraduateResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "addGraduateResponse");
    private final static QName _AddSpeaker_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "addSpeaker");
    private final static QName _AddSpeakerResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "addSpeakerResponse");
    private final static QName _GetParticipantList_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getParticipantList");
    private final static QName _GetParticipantListResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getParticipantListResponse");
    private final static QName _GetPlanning_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getPlanning");
    private final static QName _GetPlanningResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "getPlanningResponse");
    private final static QName _SetDateOfCerenomy_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "setDateOfCerenomy");
    private final static QName _SetDateOfCerenomyResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "setDateOfCerenomyResponse");
    private final static QName _ExternalPartnerException_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", "ExternalPartnerException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.polytech.polydiploma.remote.stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Planning }
     * 
     */
    public Planning createPlanning() {
        return new Planning();
    }

    /**
     * Create an instance of {@link Planning.Timeslots }
     * 
     */
    public Planning.Timeslots createPlanningTimeslots() {
        return new Planning.Timeslots();
    }

    /**
     * Create an instance of {@link AddGraduate }
     * 
     */
    public AddGraduate createAddGraduate() {
        return new AddGraduate();
    }

    /**
     * Create an instance of {@link AddGraduateResponse }
     * 
     */
    public AddGraduateResponse createAddGraduateResponse() {
        return new AddGraduateResponse();
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
     * Create an instance of {@link SetDateOfCerenomy }
     * 
     */
    public SetDateOfCerenomy createSetDateOfCerenomy() {
        return new SetDateOfCerenomy();
    }

    /**
     * Create an instance of {@link SetDateOfCerenomyResponse }
     * 
     */
    public SetDateOfCerenomyResponse createSetDateOfCerenomyResponse() {
        return new SetDateOfCerenomyResponse();
    }

    /**
     * Create an instance of {@link ExternalPartnerException }
     * 
     */
    public ExternalPartnerException createExternalPartnerException() {
        return new ExternalPartnerException();
    }

    /**
     * Create an instance of {@link Graduate }
     * 
     */
    public Graduate createGraduate() {
        return new Graduate();
    }

    /**
     * Create an instance of {@link Expected }
     * 
     */
    public Expected createExpected() {
        return new Expected();
    }

    /**
     * Create an instance of {@link Guest }
     * 
     */
    public Guest createGuest() {
        return new Guest();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Timeslot }
     * 
     */
    public Timeslot createTimeslot() {
        return new Timeslot();
    }

    /**
     * Create an instance of {@link Speaker }
     * 
     */
    public Speaker createSpeaker() {
        return new Speaker();
    }

    /**
     * Create an instance of {@link Planning.Timeslots.Entry }
     * 
     */
    public Planning.Timeslots.Entry createPlanningTimeslotsEntry() {
        return new Planning.Timeslots.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGraduate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "addGraduate")
    public JAXBElement<AddGraduate> createAddGraduate(AddGraduate value) {
        return new JAXBElement<AddGraduate>(_AddGraduate_QNAME, AddGraduate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGraduateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "addGraduateResponse")
    public JAXBElement<AddGraduateResponse> createAddGraduateResponse(AddGraduateResponse value) {
        return new JAXBElement<AddGraduateResponse>(_AddGraduateResponse_QNAME, AddGraduateResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDateOfCerenomy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "setDateOfCerenomy")
    public JAXBElement<SetDateOfCerenomy> createSetDateOfCerenomy(SetDateOfCerenomy value) {
        return new JAXBElement<SetDateOfCerenomy>(_SetDateOfCerenomy_QNAME, SetDateOfCerenomy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDateOfCerenomyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "setDateOfCerenomyResponse")
    public JAXBElement<SetDateOfCerenomyResponse> createSetDateOfCerenomyResponse(SetDateOfCerenomyResponse value) {
        return new JAXBElement<SetDateOfCerenomyResponse>(_SetDateOfCerenomyResponse_QNAME, SetDateOfCerenomyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalPartnerException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation", name = "ExternalPartnerException")
    public JAXBElement<ExternalPartnerException> createExternalPartnerException(ExternalPartnerException value) {
        return new JAXBElement<ExternalPartnerException>(_ExternalPartnerException_QNAME, ExternalPartnerException.class, null, value);
    }

}

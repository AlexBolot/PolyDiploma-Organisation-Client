package fr.polytech.polydiploma.remote.api;

import fr.polytech.polydiploma.remote.stubs.OrganisationWebService;
import fr.polytech.polydiploma.remote.stubs.OrganisationWebServiceImplService;

import javax.xml.ws.BindingProvider;
import java.net.URL;

public class PolydiplomaOrganisationPublicAPI {

    public OrganisationWebService organisation;

    public PolydiplomaOrganisationPublicAPI(String host, String port) {
        initOrganisation(host, port);
    }

    private void initOrganisation(String host, String port) {
        URL wsdlLocation = PolydiplomaOrganisationPublicAPI.class.getResource("/OrganisationWS.wsdl");
        OrganisationWebServiceImplService factory = new OrganisationWebServiceImplService(wsdlLocation);
        this.organisation = factory.getOrganisationWebServiceImplPort();
        String address = "http://" + host + ":" + port + "/polydiploma-backend/webservices/OrganisationWS";
        ((BindingProvider) organisation).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
    }

}

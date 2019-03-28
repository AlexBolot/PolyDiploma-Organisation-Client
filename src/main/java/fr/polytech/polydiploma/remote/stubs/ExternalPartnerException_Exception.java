
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2019-03-29T00:35:20.349+01:00
 * Generated source version: 3.1.10
 */

@WebFault(name = "ExternalPartnerException", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation")
public class ExternalPartnerException_Exception extends Exception {
    
    private fr.polytech.polydiploma.remote.stubs.ExternalPartnerException externalPartnerException;

    public ExternalPartnerException_Exception() {
        super();
    }
    
    public ExternalPartnerException_Exception(String message) {
        super(message);
    }
    
    public ExternalPartnerException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ExternalPartnerException_Exception(String message, fr.polytech.polydiploma.remote.stubs.ExternalPartnerException externalPartnerException) {
        super(message);
        this.externalPartnerException = externalPartnerException;
    }

    public ExternalPartnerException_Exception(String message, fr.polytech.polydiploma.remote.stubs.ExternalPartnerException externalPartnerException, Throwable cause) {
        super(message, cause);
        this.externalPartnerException = externalPartnerException;
    }

    public fr.polytech.polydiploma.remote.stubs.ExternalPartnerException getFaultInfo() {
        return this.externalPartnerException;
    }
}

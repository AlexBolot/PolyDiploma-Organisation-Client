
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2019-05-03T20:40:39.778+02:00
 * Generated source version: 3.1.10
 */

@WebFault(name = "TimeslotOverlapException", targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation")
public class TimeslotOverlapException_Exception extends Exception {
    
    private fr.polytech.polydiploma.remote.stubs.TimeslotOverlapException timeslotOverlapException;

    public TimeslotOverlapException_Exception() {
        super();
    }
    
    public TimeslotOverlapException_Exception(String message) {
        super(message);
    }
    
    public TimeslotOverlapException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public TimeslotOverlapException_Exception(String message, fr.polytech.polydiploma.remote.stubs.TimeslotOverlapException timeslotOverlapException) {
        super(message);
        this.timeslotOverlapException = timeslotOverlapException;
    }

    public TimeslotOverlapException_Exception(String message, fr.polytech.polydiploma.remote.stubs.TimeslotOverlapException timeslotOverlapException, Throwable cause) {
        super(message, cause);
        this.timeslotOverlapException = timeslotOverlapException;
    }

    public fr.polytech.polydiploma.remote.stubs.TimeslotOverlapException getFaultInfo() {
        return this.timeslotOverlapException;
    }
}


package fr.polytech.polydiploma.remote.stubs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllParticipantResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllParticipantResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="all_participant_list" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}participant" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllParticipantResponse", propOrder = {
    "allParticipantList"
})
public class GetAllParticipantResponse {

    @XmlElement(name = "all_participant_list")
    protected List<Participant> allParticipantList;

    /**
     * Gets the value of the allParticipantList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allParticipantList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllParticipantList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Participant }
     * 
     * 
     */
    public List<Participant> getAllParticipantList() {
        if (allParticipantList == null) {
            allParticipantList = new ArrayList<Participant>();
        }
        return this.allParticipantList;
    }

}

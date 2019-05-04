
package fr.polytech.polydiploma.remote.stubs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGuestFromGraduateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGuestFromGraduateResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="guest_list" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}guest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGuestFromGraduateResponse", propOrder = {
    "guestList"
})
public class GetGuestFromGraduateResponse {

    @XmlElement(name = "guest_list")
    protected List<Guest> guestList;

    /**
     * Gets the value of the guestList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Guest }
     * 
     * 
     */
    public List<Guest> getGuestList() {
        if (guestList == null) {
            guestList = new ArrayList<Guest>();
        }
        return this.guestList;
    }

}

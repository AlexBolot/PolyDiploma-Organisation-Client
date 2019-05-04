
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGuestFromGraduate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGuestFromGraduate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="graduate" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}graduate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGuestFromGraduate", propOrder = {
    "graduate"
})
public class GetGuestFromGraduate {

    protected Graduate graduate;

    /**
     * Gets the value of the graduate property.
     * 
     * @return
     *     possible object is
     *     {@link Graduate }
     *     
     */
    public Graduate getGraduate() {
        return graduate;
    }

    /**
     * Sets the value of the graduate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Graduate }
     *     
     */
    public void setGraduate(Graduate value) {
        this.graduate = value;
    }

}

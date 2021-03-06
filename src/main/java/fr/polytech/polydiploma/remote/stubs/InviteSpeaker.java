
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inviteSpeaker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inviteSpeaker"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="speaker" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}speaker" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inviteSpeaker", propOrder = {
    "speaker"
})
public class InviteSpeaker {

    protected Speaker speaker;

    /**
     * Gets the value of the speaker property.
     * 
     * @return
     *     possible object is
     *     {@link Speaker }
     *     
     */
    public Speaker getSpeaker() {
        return speaker;
    }

    /**
     * Sets the value of the speaker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Speaker }
     *     
     */
    public void setSpeaker(Speaker value) {
        this.speaker = value;
    }

}

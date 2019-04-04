
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for speaker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="speaker"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}participant"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isAttending" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "speaker", propOrder = {
    "isAttending",
    "mail"
})
public class Speaker
    extends Participant
{

    protected boolean isAttending;
    protected String mail;

    /**
     * Gets the value of the isAttending property.
     * 
     */
    public boolean isIsAttending() {
        return isAttending;
    }

    /**
     * Sets the value of the isAttending property.
     * 
     */
    public void setIsAttending(boolean value) {
        this.isAttending = value;
    }

    /**
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

}

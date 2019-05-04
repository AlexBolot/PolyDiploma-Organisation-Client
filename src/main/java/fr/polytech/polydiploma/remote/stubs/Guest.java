
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}participant"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasPayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="payingGuest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guest", propOrder = {
    "hasPayed",
    "payingGuest"
})
public class Guest
    extends Participant
{

    protected boolean hasPayed;
    protected boolean payingGuest;

    /**
     * Gets the value of the hasPayed property.
     * 
     */
    public boolean isHasPayed() {
        return hasPayed;
    }

    /**
     * Sets the value of the hasPayed property.
     * 
     */
    public void setHasPayed(boolean value) {
        this.hasPayed = value;
    }

    /**
     * Gets the value of the payingGuest property.
     * 
     */
    public boolean isPayingGuest() {
        return payingGuest;
    }

    /**
     * Sets the value of the payingGuest property.
     * 
     */
    public void setPayingGuest(boolean value) {
        this.payingGuest = value;
    }

}

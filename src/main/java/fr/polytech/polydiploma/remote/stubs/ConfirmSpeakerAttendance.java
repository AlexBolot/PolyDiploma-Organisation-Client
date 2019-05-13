
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour confirmSpeakerAttendance complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="confirmSpeakerAttendance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeslot" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}timeslot" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmSpeakerAttendance", propOrder = {
    "mail",
    "timeslot"
})
public class ConfirmSpeakerAttendance {

    protected String mail;
    protected Timeslot timeslot;

    /**
     * Obtient la valeur de la propriété mail.
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
     * Définit la valeur de la propriété mail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Obtient la valeur de la propriété timeslot.
     * 
     * @return
     *     possible object is
     *     {@link Timeslot }
     *     
     */
    public Timeslot getTimeslot() {
        return timeslot;
    }

    /**
     * Définit la valeur de la propriété timeslot.
     * 
     * @param value
     *     allowed object is
     *     {@link Timeslot }
     *     
     */
    public void setTimeslot(Timeslot value) {
        this.timeslot = value;
    }

}

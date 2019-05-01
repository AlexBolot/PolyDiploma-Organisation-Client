
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
@XmlType(name = "confirmSpeakerAttendance", propOrder = {
    "speaker"
})
public class ConfirmSpeakerAttendance {

    protected Speaker speaker;

    /**
     * Obtient la valeur de la propriété speaker.
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
     * Définit la valeur de la propriété speaker.
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

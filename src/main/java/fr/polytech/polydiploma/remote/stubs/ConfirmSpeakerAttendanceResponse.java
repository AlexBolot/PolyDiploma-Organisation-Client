
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour confirmSpeakerAttendanceResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="confirmSpeakerAttendanceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sucess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmSpeakerAttendanceResponse", propOrder = {
    "sucess"
})
public class ConfirmSpeakerAttendanceResponse {

    protected boolean sucess;

    /**
     * Gets the value of the sucess property.
     * 
     */
    public boolean isSucess() {
        return sucess;
    }

    /**
     * Sets the value of the sucess property.
     * 
     */
    public void setSucess(boolean value) {
        this.sucess = value;
    }

}

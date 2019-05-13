
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour sendMailResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="sendMailResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="send_success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMailResponse", propOrder = {
    "sendSuccess"
})
public class SendMailResponse {

    @XmlElement(name = "send_success")
    protected boolean sendSuccess;

    /**
     * Obtient la valeur de la propriété sendSuccess.
     * 
     */
    public boolean isSendSuccess() {
        return sendSuccess;
    }

    /**
     * Définit la valeur de la propriété sendSuccess.
     * 
     */
    public void setSendSuccess(boolean value) {
        this.sendSuccess = value;
    }

}

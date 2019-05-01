
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour speaker complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété isAttending.
     * 
     */
    public boolean isIsAttending() {
        return isAttending;
    }

    /**
     * Définit la valeur de la propriété isAttending.
     * 
     */
    public void setIsAttending(boolean value) {
        this.isAttending = value;
    }

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

}

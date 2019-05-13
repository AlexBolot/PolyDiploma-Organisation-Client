
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour sendMail complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="sendMail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="host_mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMail", propOrder = {
    "hostMail"
})
public class SendMail {

    @XmlElement(name = "host_mail")
    protected String hostMail;

    /**
     * Obtient la valeur de la propriété hostMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostMail() {
        return hostMail;
    }

    /**
     * Définit la valeur de la propriété hostMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostMail(String value) {
        this.hostMail = value;
    }

}

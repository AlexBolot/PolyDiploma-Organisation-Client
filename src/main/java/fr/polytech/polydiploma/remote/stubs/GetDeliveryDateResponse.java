
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getDeliveryDateResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getDeliveryDateResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="delivery_date" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDeliveryDateResponse", propOrder = {
    "deliveryDate"
})
public class GetDeliveryDateResponse {

    @XmlElement(name = "delivery_date")
    protected Date deliveryDate;

    /**
     * Obtient la valeur de la propriété deliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Définit la valeur de la propriété deliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDeliveryDate(Date value) {
        this.deliveryDate = value;
    }

}

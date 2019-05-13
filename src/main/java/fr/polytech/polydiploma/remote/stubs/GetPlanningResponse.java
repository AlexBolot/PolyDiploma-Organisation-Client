
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getPlanningResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getPlanningResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="planning" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}planning" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPlanningResponse", propOrder = {
    "planning"
})
public class GetPlanningResponse {

    protected Planning planning;

    /**
     * Obtient la valeur de la propriété planning.
     * 
     * @return
     *     possible object is
     *     {@link Planning }
     *     
     */
    public Planning getPlanning() {
        return planning;
    }

    /**
     * Définit la valeur de la propriété planning.
     * 
     * @param value
     *     allowed object is
     *     {@link Planning }
     *     
     */
    public void setPlanning(Planning value) {
        this.planning = value;
    }

}

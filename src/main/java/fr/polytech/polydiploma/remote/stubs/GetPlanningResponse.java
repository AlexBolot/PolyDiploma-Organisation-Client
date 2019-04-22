
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPlanningResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the planning property.
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
     * Sets the value of the planning property.
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

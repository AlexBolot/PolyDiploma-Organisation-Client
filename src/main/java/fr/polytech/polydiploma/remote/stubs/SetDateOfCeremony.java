
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour setDateOfCeremony complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="setDateOfCeremony"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}date" minOccurs="0"/&gt;
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
@XmlType(name = "setDateOfCeremony", propOrder = {
    "date",
    "timeslot"
})
public class SetDateOfCeremony {

    protected Date date;
    protected Timeslot timeslot;

    /**
     * Obtient la valeur de la propriété date.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Définit la valeur de la propriété date.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
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

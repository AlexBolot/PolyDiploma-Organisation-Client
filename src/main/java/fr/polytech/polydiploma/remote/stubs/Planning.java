
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for planning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="planning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateOfCeremony" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}date" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "planning", propOrder = {
    "dateOfCeremony",
    "name",
    "timeslot"
})
public class Planning {

    protected Date dateOfCeremony;
    protected String name;
    protected Timeslot timeslot;

    /**
     * Gets the value of the dateOfCeremony property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateOfCeremony() {
        return dateOfCeremony;
    }

    /**
     * Sets the value of the dateOfCeremony property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateOfCeremony(Date value) {
        this.dateOfCeremony = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the timeslot property.
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
     * Sets the value of the timeslot property.
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

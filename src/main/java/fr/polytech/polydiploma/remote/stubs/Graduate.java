
package fr.polytech.polydiploma.remote.stubs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for graduate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="graduate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}speaker"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distinctions" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}distinction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="field" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}field" minOccurs="0"/&gt;
 *         &lt;element name="guests" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}guest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "graduate", propOrder = {
    "distinctions",
    "field",
    "guests"
})
public class Graduate
    extends Speaker
{

    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected List<Distinction> distinctions;
    @XmlSchemaType(name = "string")
    protected Field field;
    @XmlElement(nillable = true)
    protected List<Guest> guests;

    /**
     * Gets the value of the distinctions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distinctions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistinctions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Distinction }
     * 
     * 
     */
    public List<Distinction> getDistinctions() {
        if (distinctions == null) {
            distinctions = new ArrayList<Distinction>();
        }
        return this.distinctions;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setField(Field value) {
        this.field = value;
    }

    /**
     * Gets the value of the guests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Guest }
     * 
     * 
     */
    public List<Guest> getGuests() {
        if (guests == null) {
            guests = new ArrayList<Guest>();
        }
        return this.guests;
    }

}

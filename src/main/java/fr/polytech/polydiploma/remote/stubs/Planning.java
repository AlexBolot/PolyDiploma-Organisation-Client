
package fr.polytech.polydiploma.remote.stubs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="timeslot" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}timeslot" minOccurs="0"/&gt;
 *         &lt;element name="timeslots"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="key" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}speaker" minOccurs="0"/&gt;
 *                             &lt;element name="value" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}timeslot" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "timeslot",
    "timeslots"
})
public class Planning {

    protected Date dateOfCeremony;
    protected Timeslot timeslot;
    @XmlElement(required = true)
    protected Planning.Timeslots timeslots;

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

    /**
     * Gets the value of the timeslots property.
     * 
     * @return
     *     possible object is
     *     {@link Planning.Timeslots }
     *     
     */
    public Planning.Timeslots getTimeslots() {
        return timeslots;
    }

    /**
     * Sets the value of the timeslots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Planning.Timeslots }
     *     
     */
    public void setTimeslots(Planning.Timeslots value) {
        this.timeslots = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="key" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}speaker" minOccurs="0"/&gt;
     *                   &lt;element name="value" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}timeslot" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class Timeslots {

        protected List<Planning.Timeslots.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Planning.Timeslots.Entry }
         * 
         * 
         */
        public List<Planning.Timeslots.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<Planning.Timeslots.Entry>();
            }
            return this.entry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="key" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}speaker" minOccurs="0"/&gt;
         *         &lt;element name="value" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}timeslot" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "key",
            "value"
        })
        public static class Entry {

            protected Speaker key;
            protected Timeslot value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link Speaker }
             *     
             */
            public Speaker getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link Speaker }
             *     
             */
            public void setKey(Speaker value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link Timeslot }
             *     
             */
            public Timeslot getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link Timeslot }
             *     
             */
            public void setValue(Timeslot value) {
                this.value = value;
            }

        }

    }

}

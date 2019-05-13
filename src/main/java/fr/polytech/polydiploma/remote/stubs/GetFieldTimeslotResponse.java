
package fr.polytech.polydiploma.remote.stubs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getFieldTimeslotResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getFieldTimeslotResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="field_timeslot"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="key" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}timeslot" minOccurs="0"/&gt;
 *                             &lt;element name="value" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}field" minOccurs="0"/&gt;
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
@XmlType(name = "getFieldTimeslotResponse", propOrder = {
    "fieldTimeslot"
})
public class GetFieldTimeslotResponse {

    @XmlElement(name = "field_timeslot", required = true)
    protected GetFieldTimeslotResponse.FieldTimeslot fieldTimeslot;

    /**
     * Obtient la valeur de la propriété fieldTimeslot.
     * 
     * @return
     *     possible object is
     *     {@link GetFieldTimeslotResponse.FieldTimeslot }
     *     
     */
    public GetFieldTimeslotResponse.FieldTimeslot getFieldTimeslot() {
        return fieldTimeslot;
    }

    /**
     * Définit la valeur de la propriété fieldTimeslot.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFieldTimeslotResponse.FieldTimeslot }
     *     
     */
    public void setFieldTimeslot(GetFieldTimeslotResponse.FieldTimeslot value) {
        this.fieldTimeslot = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     *                   &lt;element name="key" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}timeslot" minOccurs="0"/&gt;
     *                   &lt;element name="value" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}field" minOccurs="0"/&gt;
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
    public static class FieldTimeslot {

        protected List<GetFieldTimeslotResponse.FieldTimeslot.Entry> entry;

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
         * {@link GetFieldTimeslotResponse.FieldTimeslot.Entry }
         * 
         * 
         */
        public List<GetFieldTimeslotResponse.FieldTimeslot.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<GetFieldTimeslotResponse.FieldTimeslot.Entry>();
            }
            return this.entry;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="key" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}timeslot" minOccurs="0"/&gt;
         *         &lt;element name="value" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}field" minOccurs="0"/&gt;
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

            protected Timeslot key;
            @XmlSchemaType(name = "string")
            protected Field value;

            /**
             * Obtient la valeur de la propriété key.
             * 
             * @return
             *     possible object is
             *     {@link Timeslot }
             *     
             */
            public Timeslot getKey() {
                return key;
            }

            /**
             * Définit la valeur de la propriété key.
             * 
             * @param value
             *     allowed object is
             *     {@link Timeslot }
             *     
             */
            public void setKey(Timeslot value) {
                this.key = value;
            }

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link Field }
             *     
             */
            public Field getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link Field }
             *     
             */
            public void setValue(Field value) {
                this.value = value;
            }

        }

    }

}

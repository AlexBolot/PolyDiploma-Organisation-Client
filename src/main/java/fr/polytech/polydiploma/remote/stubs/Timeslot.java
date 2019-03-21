
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeslot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timeslot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endingHour" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="endingMinute" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="startingHour" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="startingMinute" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeslot", propOrder = {
    "endingHour",
    "endingMinute",
    "id",
    "startingHour",
    "startingMinute"
})
public class Timeslot {

    protected int endingHour;
    protected int endingMinute;
    protected int id;
    protected int startingHour;
    protected int startingMinute;

    /**
     * Gets the value of the endingHour property.
     * 
     */
    public int getEndingHour() {
        return endingHour;
    }

    /**
     * Sets the value of the endingHour property.
     * 
     */
    public void setEndingHour(int value) {
        this.endingHour = value;
    }

    /**
     * Gets the value of the endingMinute property.
     * 
     */
    public int getEndingMinute() {
        return endingMinute;
    }

    /**
     * Sets the value of the endingMinute property.
     * 
     */
    public void setEndingMinute(int value) {
        this.endingMinute = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the startingHour property.
     * 
     */
    public int getStartingHour() {
        return startingHour;
    }

    /**
     * Sets the value of the startingHour property.
     * 
     */
    public void setStartingHour(int value) {
        this.startingHour = value;
    }

    /**
     * Gets the value of the startingMinute property.
     * 
     */
    public int getStartingMinute() {
        return startingMinute;
    }

    /**
     * Sets the value of the startingMinute property.
     * 
     */
    public void setStartingMinute(int value) {
        this.startingMinute = value;
    }

}


package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour timeslot complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="timeslot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endingHour" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="endingMinute" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "startingHour",
    "startingMinute"
})
public class Timeslot {

    protected int endingHour;
    protected int endingMinute;
    protected int startingHour;
    protected int startingMinute;

    /**
     * Obtient la valeur de la propriété endingHour.
     * 
     */
    public int getEndingHour() {
        return endingHour;
    }

    /**
     * Définit la valeur de la propriété endingHour.
     * 
     */
    public void setEndingHour(int value) {
        this.endingHour = value;
    }

    /**
     * Obtient la valeur de la propriété endingMinute.
     * 
     */
    public int getEndingMinute() {
        return endingMinute;
    }

    /**
     * Définit la valeur de la propriété endingMinute.
     * 
     */
    public void setEndingMinute(int value) {
        this.endingMinute = value;
    }

    /**
     * Obtient la valeur de la propriété startingHour.
     * 
     */
    public int getStartingHour() {
        return startingHour;
    }

    /**
     * Définit la valeur de la propriété startingHour.
     * 
     */
    public void setStartingHour(int value) {
        this.startingHour = value;
    }

    /**
     * Obtient la valeur de la propriété startingMinute.
     * 
     */
    public int getStartingMinute() {
        return startingMinute;
    }

    /**
     * Définit la valeur de la propriété startingMinute.
     * 
     */
    public void setStartingMinute(int value) {
        this.startingMinute = value;
    }

}

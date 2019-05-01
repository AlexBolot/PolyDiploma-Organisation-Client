
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour date complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="date"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "date", propOrder = {
    "day",
    "month",
    "year"
})
public class Date {

    protected int day;
    protected int month;
    protected int year;

    /**
     * Obtient la valeur de la propriété day.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * Définit la valeur de la propriété day.
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * Obtient la valeur de la propriété month.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Définit la valeur de la propriété month.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Obtient la valeur de la propriété year.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Définit la valeur de la propriété year.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}

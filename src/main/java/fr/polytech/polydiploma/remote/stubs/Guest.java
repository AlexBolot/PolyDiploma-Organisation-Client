
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour guest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="guest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/organisation}participant"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasPayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="payingGuest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guest", propOrder = {
    "hasPayed",
    "payingGuest"
})
public class Guest
    extends Participant
{

    protected boolean hasPayed;
    protected boolean payingGuest;

    /**
     * Obtient la valeur de la propriété hasPayed.
     * 
     */
    public boolean isHasPayed() {
        return hasPayed;
    }

    /**
     * Définit la valeur de la propriété hasPayed.
     * 
     */
    public void setHasPayed(boolean value) {
        this.hasPayed = value;
    }

    /**
     * Obtient la valeur de la propriété payingGuest.
     * 
     */
    public boolean isPayingGuest() {
        return payingGuest;
    }

    /**
     * Définit la valeur de la propriété payingGuest.
     * 
     */
    public void setPayingGuest(boolean value) {
        this.payingGuest = value;
    }

}


package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for field.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="field"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SI"/&gt;
 *     &lt;enumeration value="MAM"/&gt;
 *     &lt;enumeration value="GB"/&gt;
 *     &lt;enumeration value="ITII"/&gt;
 *     &lt;enumeration value="GE"/&gt;
 *     &lt;enumeration value="ELEC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "field")
@XmlEnum
public enum Field {

    SI,
    MAM,
    GB,
    ITII,
    GE,
    ELEC;

    public String value() {
        return name();
    }

    public static Field fromValue(String v) {
        return valueOf(v);
    }

}


package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for distinction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="distinction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MAJOR"/&gt;
 *     &lt;enumeration value="HONOR"/&gt;
 *     &lt;enumeration value="HODOR"/&gt;
 *     &lt;enumeration value="HARRY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "distinction")
@XmlEnum
public enum Distinction {

    MAJOR,
    HONOR,
    HODOR,
    HARRY;

    public String value() {
        return name();
    }

    public static Distinction fromValue(String v) {
        return valueOf(v);
    }

}

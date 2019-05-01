
package fr.polytech.polydiploma.remote.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendMailToHost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendMailToHost"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mail_host" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMailToHost", propOrder = {
    "mailHost"
})
public class SendMailToHost {

    @XmlElement(name = "mail_host")
    protected String mailHost;

    /**
     * Gets the value of the mailHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailHost() {
        return mailHost;
    }

    /**
     * Sets the value of the mailHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailHost(String value) {
        this.mailHost = value;
    }

}

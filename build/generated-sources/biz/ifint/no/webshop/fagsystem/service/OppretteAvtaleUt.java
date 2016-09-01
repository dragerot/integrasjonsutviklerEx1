
package biz.ifint.no.webshop.fagsystem.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OppretteAvtaleUt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OppretteAvtaleUt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://biz/ifint/no/webshop/fagsystem/service}statusType" minOccurs="0"/>
 *         &lt;element name="avtaleNummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OppretteAvtaleUt", propOrder = {
    "status",
    "avtaleNummer"
})
public class OppretteAvtaleUt {

    @XmlElement(name = "Status")
    protected StatusType status;
    protected String avtaleNummer;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the avtaleNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvtaleNummer() {
        return avtaleNummer;
    }

    /**
     * Sets the value of the avtaleNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvtaleNummer(String value) {
        this.avtaleNummer = value;
    }

}

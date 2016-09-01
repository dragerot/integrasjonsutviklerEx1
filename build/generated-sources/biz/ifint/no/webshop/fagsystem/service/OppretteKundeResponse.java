
package biz.ifint.no.webshop.fagsystem.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oppretteKundeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oppretteKundeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OppretteKundeUt" type="{http://biz/ifint/no/webshop/fagsystem/service}OppretteKundeUt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oppretteKundeResponse", propOrder = {
    "oppretteKundeUt"
})
public class OppretteKundeResponse {

    @XmlElement(name = "OppretteKundeUt")
    protected OppretteKundeUt oppretteKundeUt;

    /**
     * Gets the value of the oppretteKundeUt property.
     * 
     * @return
     *     possible object is
     *     {@link OppretteKundeUt }
     *     
     */
    public OppretteKundeUt getOppretteKundeUt() {
        return oppretteKundeUt;
    }

    /**
     * Sets the value of the oppretteKundeUt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OppretteKundeUt }
     *     
     */
    public void setOppretteKundeUt(OppretteKundeUt value) {
        this.oppretteKundeUt = value;
    }

}

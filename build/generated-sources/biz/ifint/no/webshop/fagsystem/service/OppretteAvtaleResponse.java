
package biz.ifint.no.webshop.fagsystem.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oppretteAvtaleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oppretteAvtaleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OppretteAvtaleUt" type="{http://biz/ifint/no/webshop/fagsystem/service}OppretteAvtaleUt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oppretteAvtaleResponse", propOrder = {
    "oppretteAvtaleUt"
})
public class OppretteAvtaleResponse {

    @XmlElement(name = "OppretteAvtaleUt")
    protected OppretteAvtaleUt oppretteAvtaleUt;

    /**
     * Gets the value of the oppretteAvtaleUt property.
     * 
     * @return
     *     possible object is
     *     {@link OppretteAvtaleUt }
     *     
     */
    public OppretteAvtaleUt getOppretteAvtaleUt() {
        return oppretteAvtaleUt;
    }

    /**
     * Sets the value of the oppretteAvtaleUt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OppretteAvtaleUt }
     *     
     */
    public void setOppretteAvtaleUt(OppretteAvtaleUt value) {
        this.oppretteAvtaleUt = value;
    }

}

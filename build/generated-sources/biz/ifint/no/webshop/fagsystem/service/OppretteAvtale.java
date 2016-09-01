
package biz.ifint.no.webshop.fagsystem.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import biz.ifint.no.webshop.avtale.OppretteAvtaleInn;


/**
 * <p>Java class for oppretteAvtale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oppretteAvtale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OppretteAvtaleInn" type="{http://webshop.no.ifint.biz/avtale}OppretteAvtaleInn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oppretteAvtale", propOrder = {
    "oppretteAvtaleInn"
})
public class OppretteAvtale {

    @XmlElement(name = "OppretteAvtaleInn")
    protected OppretteAvtaleInn oppretteAvtaleInn;

    /**
     * Gets the value of the oppretteAvtaleInn property.
     * 
     * @return
     *     possible object is
     *     {@link OppretteAvtaleInn }
     *     
     */
    public OppretteAvtaleInn getOppretteAvtaleInn() {
        return oppretteAvtaleInn;
    }

    /**
     * Sets the value of the oppretteAvtaleInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OppretteAvtaleInn }
     *     
     */
    public void setOppretteAvtaleInn(OppretteAvtaleInn value) {
        this.oppretteAvtaleInn = value;
    }

}


package biz.ifint.no.webshop.fagsystem.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import biz.ifint.no.webshop.kunde.OppretteKundeInn;


/**
 * <p>Java class for oppretteKunde complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oppretteKunde">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OppretteKundeInn" type="{http://webshop.no.ifint.biz/kunde}OppretteKundeInn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oppretteKunde", propOrder = {
    "oppretteKundeInn"
})
public class OppretteKunde {

    @XmlElement(name = "OppretteKundeInn")
    protected OppretteKundeInn oppretteKundeInn;

    /**
     * Gets the value of the oppretteKundeInn property.
     * 
     * @return
     *     possible object is
     *     {@link OppretteKundeInn }
     *     
     */
    public OppretteKundeInn getOppretteKundeInn() {
        return oppretteKundeInn;
    }

    /**
     * Sets the value of the oppretteKundeInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OppretteKundeInn }
     *     
     */
    public void setOppretteKundeInn(OppretteKundeInn value) {
        this.oppretteKundeInn = value;
    }

}

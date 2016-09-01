
package biz.ifint.no.webshop.kunde;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import biz.ifint.no.webshop.fagsystem.service.Kunde;


/**
 * <p>Java class for OppretteKundeInn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OppretteKundeInn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kunde" type="{http://biz/ifint/no/webshop/fagsystem/service}Kunde"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OppretteKundeInn", propOrder = {
    "kunde"
})
public class OppretteKundeInn {

    @XmlElement(name = "Kunde", required = true)
    protected Kunde kunde;

    /**
     * Gets the value of the kunde property.
     * 
     * @return
     *     possible object is
     *     {@link Kunde }
     *     
     */
    public Kunde getKunde() {
        return kunde;
    }

    /**
     * Sets the value of the kunde property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kunde }
     *     
     */
    public void setKunde(Kunde value) {
        this.kunde = value;
    }

}

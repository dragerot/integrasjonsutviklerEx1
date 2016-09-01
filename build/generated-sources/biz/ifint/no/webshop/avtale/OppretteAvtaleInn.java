
package biz.ifint.no.webshop.avtale;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import biz.ifint.no.webshop.fagsystem.service.Betingelser;
import biz.ifint.no.webshop.fagsystem.service.Produkt;


/**
 * <p>Java class for OppretteAvtaleInn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OppretteAvtaleInn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KundeNummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Produkt" type="{http://biz/ifint/no/webshop/fagsystem/service}Produkt"/>
 *         &lt;element name="Betingelser" type="{http://biz/ifint/no/webshop/fagsystem/service}Betingelser"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OppretteAvtaleInn", propOrder = {
    "kundeNummer",
    "produkt",
    "betingelser"
})
public class OppretteAvtaleInn {

    @XmlElement(name = "KundeNummer")
    protected String kundeNummer;
    @XmlElement(name = "Produkt", required = true)
    protected Produkt produkt;
    @XmlElement(name = "Betingelser", required = true)
    protected Betingelser betingelser;

    /**
     * Gets the value of the kundeNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKundeNummer() {
        return kundeNummer;
    }

    /**
     * Sets the value of the kundeNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKundeNummer(String value) {
        this.kundeNummer = value;
    }

    /**
     * Gets the value of the produkt property.
     * 
     * @return
     *     possible object is
     *     {@link Produkt }
     *     
     */
    public Produkt getProdukt() {
        return produkt;
    }

    /**
     * Sets the value of the produkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Produkt }
     *     
     */
    public void setProdukt(Produkt value) {
        this.produkt = value;
    }

    /**
     * Gets the value of the betingelser property.
     * 
     * @return
     *     possible object is
     *     {@link Betingelser }
     *     
     */
    public Betingelser getBetingelser() {
        return betingelser;
    }

    /**
     * Sets the value of the betingelser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Betingelser }
     *     
     */
    public void setBetingelser(Betingelser value) {
        this.betingelser = value;
    }

}

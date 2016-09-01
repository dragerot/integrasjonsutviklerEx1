
package biz.ifint.no.webshop.fagsystem.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Produkt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Produkt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProduktId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Produkt", propOrder = {
    "produktId"
})
public class Produkt {

    @XmlElement(name = "ProduktId", required = true)
    protected String produktId;

    /**
     * Gets the value of the produktId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduktId() {
        return produktId;
    }

    /**
     * Sets the value of the produktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduktId(String value) {
        this.produktId = value;
    }

}

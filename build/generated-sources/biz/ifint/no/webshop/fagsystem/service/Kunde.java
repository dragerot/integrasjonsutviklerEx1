
package biz.ifint.no.webshop.fagsystem.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Kunde complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Kunde">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ssn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BostedAdresse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BostedPostNummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PostSted" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Epost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kunde", propOrder = {
    "ssn",
    "bostedAdresse",
    "bostedPostNummer",
    "postSted",
    "epost"
})
public class Kunde {

    @XmlElement(name = "Ssn", required = true)
    protected String ssn;
    @XmlElement(name = "BostedAdresse", required = true)
    protected String bostedAdresse;
    @XmlElement(name = "BostedPostNummer", required = true)
    protected String bostedPostNummer;
    @XmlElement(name = "PostSted", required = true)
    protected String postSted;
    @XmlElement(name = "Epost", required = true)
    protected String epost;

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the bostedAdresse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBostedAdresse() {
        return bostedAdresse;
    }

    /**
     * Sets the value of the bostedAdresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBostedAdresse(String value) {
        this.bostedAdresse = value;
    }

    /**
     * Gets the value of the bostedPostNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBostedPostNummer() {
        return bostedPostNummer;
    }

    /**
     * Sets the value of the bostedPostNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBostedPostNummer(String value) {
        this.bostedPostNummer = value;
    }

    /**
     * Gets the value of the postSted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostSted() {
        return postSted;
    }

    /**
     * Sets the value of the postSted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostSted(String value) {
        this.postSted = value;
    }

    /**
     * Gets the value of the epost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpost() {
        return epost;
    }

    /**
     * Sets the value of the epost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpost(String value) {
        this.epost = value;
    }

}

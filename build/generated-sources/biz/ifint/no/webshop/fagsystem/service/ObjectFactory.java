
package biz.ifint.no.webshop.fagsystem.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the biz.ifint.no.webshop.fagsystem.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OppretteKunde_QNAME = new QName("http://biz/ifint/no/webshop/fagsystem/service", "oppretteKunde");
    private final static QName _OppretteKundeResponse_QNAME = new QName("http://biz/ifint/no/webshop/fagsystem/service", "oppretteKundeResponse");
    private final static QName _OppretteAvtaleResponse_QNAME = new QName("http://biz/ifint/no/webshop/fagsystem/service", "oppretteAvtaleResponse");
    private final static QName _OppretteAvtale_QNAME = new QName("http://biz/ifint/no/webshop/fagsystem/service", "oppretteAvtale");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: biz.ifint.no.webshop.fagsystem.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OppretteAvtaleResponse }
     * 
     */
    public OppretteAvtaleResponse createOppretteAvtaleResponse() {
        return new OppretteAvtaleResponse();
    }

    /**
     * Create an instance of {@link OppretteKunde }
     * 
     */
    public OppretteKunde createOppretteKunde() {
        return new OppretteKunde();
    }

    /**
     * Create an instance of {@link OppretteKundeResponse }
     * 
     */
    public OppretteKundeResponse createOppretteKundeResponse() {
        return new OppretteKundeResponse();
    }

    /**
     * Create an instance of {@link OppretteAvtale }
     * 
     */
    public OppretteAvtale createOppretteAvtale() {
        return new OppretteAvtale();
    }

    /**
     * Create an instance of {@link Produkt }
     * 
     */
    public Produkt createProdukt() {
        return new Produkt();
    }

    /**
     * Create an instance of {@link Kunde }
     * 
     */
    public Kunde createKunde() {
        return new Kunde();
    }

    /**
     * Create an instance of {@link OppretteAvtaleUt }
     * 
     */
    public OppretteAvtaleUt createOppretteAvtaleUt() {
        return new OppretteAvtaleUt();
    }

    /**
     * Create an instance of {@link Betingelser }
     * 
     */
    public Betingelser createBetingelser() {
        return new Betingelser();
    }

    /**
     * Create an instance of {@link OppretteKundeUt }
     * 
     */
    public OppretteKundeUt createOppretteKundeUt() {
        return new OppretteKundeUt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OppretteKunde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biz/ifint/no/webshop/fagsystem/service", name = "oppretteKunde")
    public JAXBElement<OppretteKunde> createOppretteKunde(OppretteKunde value) {
        return new JAXBElement<OppretteKunde>(_OppretteKunde_QNAME, OppretteKunde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OppretteKundeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biz/ifint/no/webshop/fagsystem/service", name = "oppretteKundeResponse")
    public JAXBElement<OppretteKundeResponse> createOppretteKundeResponse(OppretteKundeResponse value) {
        return new JAXBElement<OppretteKundeResponse>(_OppretteKundeResponse_QNAME, OppretteKundeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OppretteAvtaleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biz/ifint/no/webshop/fagsystem/service", name = "oppretteAvtaleResponse")
    public JAXBElement<OppretteAvtaleResponse> createOppretteAvtaleResponse(OppretteAvtaleResponse value) {
        return new JAXBElement<OppretteAvtaleResponse>(_OppretteAvtaleResponse_QNAME, OppretteAvtaleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OppretteAvtale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biz/ifint/no/webshop/fagsystem/service", name = "oppretteAvtale")
    public JAXBElement<OppretteAvtale> createOppretteAvtale(OppretteAvtale value) {
        return new JAXBElement<OppretteAvtale>(_OppretteAvtale_QNAME, OppretteAvtale.class, null, value);
    }

}

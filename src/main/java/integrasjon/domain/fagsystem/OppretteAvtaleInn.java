package integrasjon.domain.fagsystem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OppretteAvtaleInn",namespace = "http://webshop.no.ifint.biz/avtale",
        propOrder = {
                "kundeNummer",
                "produkt",
                "betingelser"

        })
public class OppretteAvtaleInn {
    @XmlElement(name = "KundeNummer")
    private String kundeNummer;
    @XmlElement(name = "Produkt",required = true)
    Produkt produkt;
    @XmlElement(name = "Betingelser",required = true)
    Betingelser betingelser;

    public String getKundeNummer() {
        return kundeNummer;
    }

    public void setKundeNummer(String kundeNummer) {
        this.kundeNummer = kundeNummer;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }

    public Betingelser getBetingelser() {
        return betingelser;
    }

    public void setBetingelser(Betingelser betingelser) {
        this.betingelser = betingelser;
    }
}

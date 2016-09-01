package integrasjon.domain.fagsystem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OppretteKundeAvtaleInn",namespace = "http://webshop.no.ifint.biz/kundeavtale",
        propOrder = {
                "kunde"
        })
public class OppretteKundeAvtaleInn {
    @XmlElement(name = "Kunde", required = true)
    Kunde kunde;

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

}

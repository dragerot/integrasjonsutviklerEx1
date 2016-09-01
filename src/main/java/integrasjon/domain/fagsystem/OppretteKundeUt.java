package integrasjon.domain.fagsystem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OppretteKundeUt",
        propOrder = {
                "status","kundeNummer"
        })
public class OppretteKundeUt {
    @XmlElement(name = "Status")
    private StatusType status;
    @XmlElement(name = "KundeNummer")
    private String kundeNummer;

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public String getKundeNummer() {
        return kundeNummer;
    }

    public void setKundeNummer(String kundeNummer) {
        this.kundeNummer = kundeNummer;
    }
}

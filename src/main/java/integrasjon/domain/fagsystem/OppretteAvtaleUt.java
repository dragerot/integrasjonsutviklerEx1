package integrasjon.domain.fagsystem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OppretteAvtaleUt",
        propOrder = {
                "status","avtaleNummer"
        })
public class OppretteAvtaleUt {
    @XmlElement(name = "Status")
    private StatusType status;
    @XmlElement(name = "avtaleNummer")
    private String avtaleNummer;

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public String getAvtaleNummer() {
        return avtaleNummer;
    }

    public void setAvtaleNummer(String avtaleNummer) {
        this.avtaleNummer = avtaleNummer;
    }
}

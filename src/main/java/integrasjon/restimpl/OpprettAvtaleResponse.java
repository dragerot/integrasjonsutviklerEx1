package integrasjon.restimpl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "OpprettAvtaleResponse")
@XmlType(name = "OpprettAvtaleResponse", propOrder = {
        "status",
        "avtalenummer"
})
public class OpprettAvtaleResponse implements Serializable{
    String status;
    String avtalenummer;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAvtalenummer() {
        return avtalenummer;
    }

    public void setAvtalenummer(String avtalenummer) {
        this.avtalenummer = avtalenummer;
    }
}

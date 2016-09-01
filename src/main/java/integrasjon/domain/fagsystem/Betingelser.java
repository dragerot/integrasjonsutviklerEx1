package integrasjon.domain.fagsystem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Betingelser", propOrder = {
        "enBetingelse"
})
public class Betingelser {
    @XmlElement(name = "EnBetingelse", required = true)
    String enBetingelse;

    public String getEnBetingelse() {
        return enBetingelse;
    }

    public void setEnBetingelse(String enBetingelse) {
        this.enBetingelse = enBetingelse;
    }
}

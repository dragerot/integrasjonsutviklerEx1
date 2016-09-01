package integrasjon.domain.fagsystem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Produkt",
        propOrder = {
                "produktId"
        })
public class Produkt {
    @XmlElement(name = "ProduktId", required = true)
    String produktId;

    public String getProduktId() {
        return produktId;
    }

    public void setProduktId(String produktId) {
        this.produktId = produktId;
    }
}

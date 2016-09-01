package integrasjon.domain.fagsystem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kunde", propOrder = {
        "ssn",
        "bostedAdresse",
        "bostedPostNummer",
        "postSted",
         "epost"
})
public class Kunde {
    @XmlElement(name = "Ssn",required = true)
    private String ssn;
    @XmlElement(name = "BostedAdresse",required = true)
    private String bostedAdresse;
    @XmlElement(name = "BostedPostNummer",required = true)
    private String bostedPostNummer;
    @XmlElement(name = "PostSted",required = true)
    private String postSted;
    @XmlElement(name = "Epost",required = true)
    private String epost;

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getBostedAdresse() {
        return bostedAdresse;
    }

    public void setBostedAdresse(String bostedAdresse) {
        this.bostedAdresse = bostedAdresse;
    }

    public String getBostedPostNummer() {
        return bostedPostNummer;
    }

    public void setBostedPostNummer(String bostedPostNummer) {
        this.bostedPostNummer = bostedPostNummer;
    }

    public String getPostSted() {
        return postSted;
    }

    public void setPostSted(String postSted) {
        this.postSted = postSted;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }
}


package biz.ifint.no.webshop.fagsystem.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Opprettet"/>
 *     &lt;enumeration value="IkkeOpprettet"/>
 *     &lt;enumeration value="BusinessFault"/>
 *     &lt;enumeration value="SystemFault"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusType")
@XmlEnum
public enum StatusType {

    @XmlEnumValue("Opprettet")
    OPPRETTET("Opprettet"),
    @XmlEnumValue("IkkeOpprettet")
    IKKE_OPPRETTET("IkkeOpprettet"),
    @XmlEnumValue("BusinessFault")
    BUSINESS_FAULT("BusinessFault"),
    @XmlEnumValue("SystemFault")
    SYSTEM_FAULT("SystemFault");
    private final String value;

    StatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusType fromValue(String v) {
        for (StatusType c: StatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

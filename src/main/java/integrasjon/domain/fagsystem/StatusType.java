package integrasjon.domain.fagsystem;

public enum StatusType {
    Opprettet("Opprettet"),
    IkkeOpprettet("IkkeOpprettet"),
    BusinessFault("BusinessFault"),
    SystemFault("SystemFault");


    private final String value;

    StatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusType fromValue(String v) {
        for (StatusType c : StatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}

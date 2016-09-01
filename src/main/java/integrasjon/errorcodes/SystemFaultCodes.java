package integrasjon.errorcodes;


import integrasjon.fault.FaultCodes;

public enum SystemFaultCodes implements FaultCodes {
    //TODO: Add FaultCode error numbers
    FEILER_KUNDEREGISTRERING("1", "Greide ikke å registrere kunde"),
    FEILER_AVTALEREGISTERING("2", "Feiler når man registrerer avtale");
    
    private final String code;
    private final String message;

    private SystemFaultCodes(String code, String description) {
        this.code = code;
        this.message = description;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getCode() {
        return code;
    }
}

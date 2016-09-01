package integrasjon.errorcodes;


import integrasjon.fault.FaultCodes;

public enum BusinessFaultCodes implements FaultCodes {
    REGISTRERE_KUNDE_1("1", "SSN nummer starter på D"),
    REGISTRERE_AVTALE_KUNDE("2", "Avtale ikke gyldig for kundenummer ");
    private final String code;
   private final String message;  

    private BusinessFaultCodes(String code, String description) {
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

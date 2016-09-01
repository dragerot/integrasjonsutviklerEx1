package integrasjon.transform;

import integrasjon.errorcodes.BusinessFaultCodes;
import integrasjon.errorcodes.SystemFaultCodes;
import integrasjon.fault.BusinessFault;
import integrasjon.fault.SystemFault;
import integrasjon.domain.fagsystem.*;
import org.apache.camel.Exchange;

public class FagsystemMock {
    final static private String KUNDENR_1="1";
    final static private String KUNDENR_2="2";
    final static private String KUNDENR_3="3";
    final static private String KUNDENR_4="4";
    final static private String AVTALE_1="1";
    final static private String AVTALE_2="2";
    final static private String AVTALE_3="3";
    final static private String AVTALE_4="4";

    public void registrerKunde(Exchange exchange) {
        OppretteKundeInn oppretteKundeInn =exchange.getProperty("oppretteKundeInn",OppretteKundeInn.class);
        OppretteKundeUt oppretteKundeUt= new OppretteKundeUt();
        oppretteKundeUt.setStatus(StatusType.Opprettet);
        if(oppretteKundeInn.getKunde().getSsn().startsWith(KUNDENR_1)) oppretteKundeUt.setKundeNummer(KUNDENR_1);
        else if(oppretteKundeInn.getKunde().getSsn().startsWith(KUNDENR_2)) oppretteKundeUt.setKundeNummer("2");
        else if(oppretteKundeInn.getKunde().getSsn().startsWith(KUNDENR_3)) throw new SystemFault(SystemFaultCodes.FEILER_KUNDEREGISTRERING.getMessage());
        else if(oppretteKundeInn.getKunde().getSsn().startsWith(KUNDENR_4)) throw new BusinessFault(BusinessFaultCodes.REGISTRERE_KUNDE_1.getMessage());
       exchange.getIn().setBody(oppretteKundeUt);
    }

    public void registrerAvtale(Exchange exchange) {
        OppretteAvtaleInn oppretteAvtaleInn =exchange.getProperty("oppretteAvtaleInn",OppretteAvtaleInn.class);
        OppretteAvtaleUt oppretteAvtaleUt= new OppretteAvtaleUt();
        oppretteAvtaleUt.setStatus(StatusType.Opprettet);
        if(oppretteAvtaleInn.getKundeNummer().startsWith(KUNDENR_1)) oppretteAvtaleUt.setAvtaleNummer(AVTALE_1);
        else if(oppretteAvtaleInn.getKundeNummer().startsWith(KUNDENR_2)) oppretteAvtaleUt.setAvtaleNummer(AVTALE_2);
        else if(oppretteAvtaleInn.getKundeNummer().startsWith(KUNDENR_3)) throw new SystemFault(SystemFaultCodes.FEILER_AVTALEREGISTERING.getMessage());
        else if(oppretteAvtaleInn.getKundeNummer().startsWith(KUNDENR_4)) throw new BusinessFault(BusinessFaultCodes.REGISTRERE_AVTALE_KUNDE.getMessage()+KUNDENR_4);
        exchange.getIn().setBody(oppretteAvtaleUt);
    }
}

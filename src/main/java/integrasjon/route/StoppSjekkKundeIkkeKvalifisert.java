package integrasjon.route;


import integrasjon.domain.fagsystem.OppretteAvtaleUt;
import integrasjon.domain.fagsystem.StatusType;
import org.apache.camel.Exchange;
import org.apache.camel.Predicate;

public class StoppSjekkKundeIkkeKvalifisert {

    public void validate(Exchange exchange) {

        OppretteAvtaleUt oppretteAvtaleUt= new OppretteAvtaleUt();
        oppretteAvtaleUt.setStatus(StatusType.Opprettet);
        oppretteAvtaleUt.setAvtaleNummer("12121");
        exchange.getIn().setBody(oppretteAvtaleUt);
//        StatusResponse statusResponse=exchange.getIn().getBody(StatusResponse.class);
//        if (statusResponse == null || statusResponse.getStatusType() != StatusType.Qualify) {

//            throw new BusinessFault( BusinessFaultCodes.FINNNO_CARCHANGE_orderBBF_FINNKODE_NOT_QUALIFY_ERROR.getCode(),
//                    BusinessFaultCodes.FINNNO_CARCHANGE_orderBBF_FINNKODE_NOT_QUALIFY_ERROR.getMessage(),
//                    systemInfo);
//        }


    }
}
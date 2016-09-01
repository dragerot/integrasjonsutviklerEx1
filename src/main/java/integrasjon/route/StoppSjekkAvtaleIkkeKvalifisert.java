package integrasjon.route;

import integrasjon.domain.fagsystem.OppretteAvtaleInn;
import org.apache.camel.ExchangeProperty;

public class StoppSjekkAvtaleIkkeKvalifisert {

    public void validate(
            @ExchangeProperty("oppretteAvtaleInn") OppretteAvtaleInn oppretteAvtaleInn
    ) {
//        if (quoteRequest == null ||
//                quoteRequest.getFinnCode() == null || quoteRequest.getFinnCode() == null ||
//                quoteRequest.getGearBoxType() == null ||
//                quoteRequest.getLicensePlate() == null || quoteRequest.getLicensePlate().trim().length() == 0 ||
//                quoteRequest.getCarMilage() < 0) {
//            throw new BusinessFault(BusinessFaultCodes.FINNNO_CARCHANGE_saveQuoteBBF_REQUEST_VALIDATE_ERROR, systemInfo);
//        }
    }
}

package integrasjon.route;

import org.apache.camel.Exchange;
import org.apache.camel.Predicate;

public class OrderOkPredicate implements Predicate {
    @Override
    public boolean matches(Exchange exchange) {
        boolean response=true;
//        StatusResponse statusResponse = exchange.getProperty("orderResponse",StatusResponse.class);
//        if(statusResponse==null || statusResponse.getStatusType() != StatusType.AllreadyInsured) response=false;
        return response;
    }
}

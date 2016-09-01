package integrasjon.transform;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import integrasjon.restimpl.OpprettAvtaleResponse;
import org.apache.camel.Exchange;
import org.apache.cxf.message.MessageContentsList;

public class RestGetOpprettAvtaleTransform {

    @SuppressWarnings("UnusedDeclaration")
    public void response(Exchange exchange) {
        //Car car = exchange.getIn().getBody(Car.class);
        OpprettAvtaleResponse opprettAvtaleResponse = new OpprettAvtaleResponse();
        opprettAvtaleResponse.setStatus("OK");
        opprettAvtaleResponse.setAvtalenummer("12212");
        exchange.getOut().setBody(opprettAvtaleResponse);
    }
}

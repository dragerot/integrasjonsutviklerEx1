package integrasjon.restimpl;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import org.apache.camel.Exchange;
import static org.apache.camel.Exchange.EXCEPTION_CAUGHT;
//import org.apache.cxf.binding.soap.SoapFault;

public class RestExceptionHandler {

    @SuppressWarnings("UnusedDeclaration")
    public void process(Exchange exchng) throws Exception {
        Throwable caused = exchng.getProperty(EXCEPTION_CAUGHT, Throwable.class);
        throw getBusinessFault((integrasjon.fault.BusinessFault) caused);
    }

    private WebApplicationException getBusinessFault(integrasjon.fault.BusinessFault businessFault) {
        BusinessFault loBusinessFault = new BusinessFault();
        Response.ResponseBuilder builder = Response.status(Response.Status.NOT_ACCEPTABLE);
        builder.type("application/json");
        loBusinessFault.setId("status");
        loBusinessFault.setMessage("BusinessFeil");
        builder.entity(loBusinessFault);
        return (new WebApplicationException(builder.build()));
    }
}

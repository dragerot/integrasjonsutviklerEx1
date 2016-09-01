package integrasjon.route;

import integrasjon.restimpl.RestExceptionHandler;
import integrasjon.transform.RestGetOpprettAvtaleTransform;
import org.apache.camel.builder.RouteBuilder;

import javax.ws.rs.WebApplicationException;

public class RestRoute extends RouteBuilder {

    private final String uriRest = "cxfrs:bean:rsServer?bindingStyle=SimpleConsumer";

    @Override
    public void configure() throws Exception {
        onException(WebApplicationException.class).stop();
        onException(Exception.class).bean(RestExceptionHandler.class).handled(true).stop();

        from(uriRest).routeId("rest:opprettAvtale:EntryPoint").
                recipientList(simple("direct:${header.operationName}"));


        from("direct:getOpprettAvtale").routeId("rest:opprettAvtale:getOpprettAvtale").
//                bean(RestGetOpprettAvtaleTransform.class,"request").
//                setHeader("operationNamespace", constant("http://biz/ifint/no/webshop/car/service")).
//                setHeader("operationName", constant("identifyCar")).
//                to("cxf:bean:carService").
                bean(RestGetOpprettAvtaleTransform.class,"response").
                end();
    }


    //RestExceptionHandler
    //        from(uriWS).routeId("Finnno:EntryPoint").
//                recipientList(simple("direct:baal:${header.operationName}")).
//                removeHeaders("*").
//                end();



}

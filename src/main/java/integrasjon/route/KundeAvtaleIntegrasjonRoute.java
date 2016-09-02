package integrasjon.route;

import integrasjon.domain.fagsystem.OppretteAvtaleInn;
import integrasjon.domain.fagsystem.OppretteKundeInn;
import integrasjon.fault.BusinessFault;
import integrasjon.fault.SystemFault;
import integrasjon.service.FagSystemService;
import integrasjon.service.OpprettKundeAvtaleService;
import integrasjon.transform.FagsystemMock;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

//http://localhost:8080/webshop-finnno/webservices/kundeavtaleintegrasjon?wsdl
public class KundeAvtaleIntegrasjonRoute extends RouteBuilder {

    private final String uri = "cxf:/kundeavtaleintegrasjon?serviceClass=" + OpprettKundeAvtaleService.class.getName();

    @Override
    public void configure() throws Exception {
        onException(SystemFault.class, BusinessFault.class).stop();

        from(uri).routeId("Integrasjon:opprettAvtale:EntryPoint").

                recipientList(simple("direct:csl:${header.operationName}"));

        /**
        * Integrasjon
        */
       from("direct:csl:opprettKundeAvtale").routeId("csl:oppretteKundeAvtale").
                process(new PrepareMessageProcessor()).
                setProperty("oppretteKundeInn", simple("${body}", OppretteKundeInn.class)).
                bean(StoppSjekkKundeIkkeKvalifisert.class).
                to("direct:baal:registerKunde").
                bean(StoppSjekkAvtaleIkkeKvalifisert.class).
                to("direct:baal:registerAvtale").
                //bean("stoppSjekkStatusIkkeKvalifisert").
                //to("direct:baal:oppdatereStatus").
                to("direct:baal:Sendepost").
                end();

       from("direct:baal:registerKunde").routeId("baal:oppretteKundeAvtale").
              //bean(OpprettKundeAvtaleTransform.class).
//               setHeader("operationNamespace", constant("http://biz/ifint/no/webshop/fagsystem/service")).
//               setHeader("operationName", constant("oppretteKunde")).
//               to("cxf:bean:fagsystemService").
               end();

        from("direct:baal:registerAvtale").routeId("baal:registerAvtale").
                //bean(OpprettKundeAvtaleTransform.class).
//               setHeader("operationNamespace", constant("http://biz/ifint/no/webshop/fagsystem/service")).
//               setHeader("operationName", constant("oppretteOppdrag")).
//               to("cxf:bean:fagsystemService").
        end();


      from("direct:baal:oppdatereStatus").routeId("baal:oppdatereStatus").
                //bean("OppdatereStatusTransform.class).
//               setHeader("operationNamespace", constant("http://biz/ifint/no/webshop/fagsystem/service")).
//               setHeader("operationName", constant("oppdatereStatus")).
//               to("cxf:bean:fagsystemService").
        end();

//        from("direct:baal:Sendepost").routeId("sendbrev").
//                to("TODO").
//                end();
    }
    

}

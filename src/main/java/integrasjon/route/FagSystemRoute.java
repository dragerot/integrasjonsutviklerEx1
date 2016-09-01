package integrasjon.route;

import integrasjon.domain.fagsystem.OppretteAvtaleInn;
import integrasjon.domain.fagsystem.OppretteKundeInn;
import integrasjon.fault.BusinessFault;
import integrasjon.fault.SystemFault;
import integrasjon.service.FagSystemService;
import integrasjon.transform.FagsystemMock;
import org.apache.camel.builder.RouteBuilder;

//http://localhost:8080/webshop-finnno/webservices/fagsystemintegrasjon?wsdl
public class FagSystemRoute extends RouteBuilder {

    private final String uri = "cxf:/fagsystemintegrasjon?serviceClass=" + FagSystemService.class.getName();

    @Override
    public void configure() throws Exception {
        onException(SystemFault.class, BusinessFault.class).stop();

        from(uri).routeId("Fagsystem:opprettAvtale:EntryPoint").
                recipientList(simple("direct:baal:${header.operationName}"));

        /**
         * Fagsystem webservices
         */
        from("direct:baal:oppretteKunde").routeId("Fagsystem:oppretteKunde").
                process(new PrepareMessageProcessor()).
                setProperty("oppretteKundeInn", simple("${body}", OppretteKundeInn.class)).
                //bean(StoppSjekkKundeIkkeKvalifisert.class).
                        bean(FagsystemMock.class, "registrerKunde").
                end();

        from("direct:baal:oppretteAvtale").routeId("Fagsystem:oppretteAvtale").
                process(new PrepareMessageProcessor()).
                setProperty("oppretteAvtaleInn", simple("${body}", OppretteAvtaleInn.class)).
                //bean(StoppSjekkAvtaleIkkeKvalifisert.class).
                        bean(FagsystemMock.class, "registrerAvtale").
                end();
    }
}

package integrasjon.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;

/**
 * @author fh6
 */
public class PrepareMessageProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getIn().removeHeaders("*");
        MessageContentsList messageContentsList = exchange.getIn().getBody(MessageContentsList.class);
        exchange.getIn().setBody(messageContentsList.get(0));
    }
}

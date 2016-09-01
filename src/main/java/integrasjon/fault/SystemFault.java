package integrasjon.fault;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.ws.WebFault;


@WebFault(name = "SystemFault", targetNamespace = "http://biz/ifint/no/webshop/common/fault")
@XmlRootElement(name = "SystemFault", namespace = "http://biz/ifint/no/webshop/common/fault")
public class SystemFault extends RuntimeException  {

    public static final long serialVersionUID = 20110126200613L;

    public SystemFault(String message){
        super(message);
    }
}

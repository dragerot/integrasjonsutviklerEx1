package integrasjon.fault;

import javax.xml.bind.annotation.*;
import javax.xml.ws.WebFault;


@WebFault(name = "BusinessFault", targetNamespace = "http://biz/ifint/no/webshop/common/fault")
@XmlRootElement(name = "BusinessFault", namespace = "http://biz/ifint/no/webshop/common/fault")
public class BusinessFault extends RuntimeException  {

    public static final long serialVersionUID = 20110126200613L;

    public BusinessFault(String message){
        super(message);
    }
}

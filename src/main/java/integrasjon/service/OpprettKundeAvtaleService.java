package integrasjon.service;


import integrasjon.domain.fagsystem.OppretteAvtaleUt;
import integrasjon.domain.fagsystem.OppretteKundeAvtaleInn;
import integrasjon.domain.fagsystem.OppretteKundeInn;
import integrasjon.fault.BusinessFault;
import integrasjon.fault.SystemFault;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(portName = "Service", targetNamespace = "http://biz/ifint/no/webshop/kundeavtale/service")
public interface OpprettKundeAvtaleService {
    @WebResult(name = "OppretteKundeUt")
    @WebMethod(operationName = "opprettKundeAvtale")
    OppretteAvtaleUt opprettKundeAvtale(@WebParam(name = "OppretteKundeAvtaleInn") OppretteKundeAvtaleInn oppretteKundeAvtaleInn) throws BusinessFault, SystemFault;

}

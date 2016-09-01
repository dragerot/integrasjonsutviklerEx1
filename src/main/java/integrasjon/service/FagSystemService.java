package integrasjon.service;

import integrasjon.domain.fagsystem.OppretteAvtaleInn;
import integrasjon.domain.fagsystem.OppretteAvtaleUt;
import integrasjon.domain.fagsystem.OppretteKundeInn;
import integrasjon.domain.fagsystem.OppretteKundeUt;
import integrasjon.fault.BusinessFault;
import integrasjon.fault.SystemFault;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService(portName = "Service", targetNamespace = "http://biz/ifint/no/webshop/fagsystem/service")
public interface FagSystemService {

      @WebResult(name = "OppretteKundeUt")
      @WebMethod(operationName = "oppretteKunde")
      OppretteKundeUt oppretteKunde(@WebParam(name = "OppretteKundeInn") OppretteKundeInn oppretteKundeInn) throws BusinessFault, SystemFault;

      @WebResult(name = "OppretteAvtaleUt")
      @WebMethod(operationName = "oppretteAvtale")
      OppretteAvtaleUt oppretteAvtale(@WebParam(name = "OppretteAvtaleInn") OppretteAvtaleInn oppretteAvtaleInn) throws BusinessFault, SystemFault;

}




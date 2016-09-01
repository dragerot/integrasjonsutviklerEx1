package integrasjon.service;


import integrasjon.restimpl.OpprettAvtaleResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * http://localhost:8080/webshop-finno/webservices/rest/opprettAvtale?ssn=1&requestId=12121
*/
@Path("/rest/")
public class FagSystemRestService {
    @Context
    private UriInfo uriInfo;

    @GET
    @Path("/opprettAvtale")
    @Produces("application/json")
    public OpprettAvtaleResponse getOpprettAvtale(
            @QueryParam("ssn")int ssn,
            @QueryParam("requestId") String requestId
    ){
        return null;
    }
}

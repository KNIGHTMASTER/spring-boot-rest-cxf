package com.zisal.springbootrestcxf.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created on 4/22/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Path("/echo")
public interface IEchoEndPoint {

    @GET
    @Path("/{a}")
    @Produces(MediaType.APPLICATION_JSON)
    Response echo(@PathParam("a") String p_a);
}

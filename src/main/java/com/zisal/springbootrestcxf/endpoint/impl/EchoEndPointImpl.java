package com.zisal.springbootrestcxf.endpoint.impl;

import com.zisal.springbootrestcxf.endpoint.IEchoEndPoint;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Component;

import javax.websocket.server.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created on 4/22/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Api("Echo EndPoint")
@Component
public class EchoEndPointImpl implements IEchoEndPoint {

    @Override
    public Response echo(@PathParam("a") String p_a) {
        String responseString = "Welcome ";
        if (p_a != null) {
            responseString = responseString.concat(p_a);
        }
        return Response.ok(responseString).build();
    }
}

package com.zisal.springbootrestcxf.endpoint;

import com.zisal.springbootrestcxf.dto.EmployeeDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created on 4/22/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Path("/employee")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public interface IEmployeeEndPoint {

    @POST
    @Path("/insert")
    Response insert(EmployeeDTO employeeDTO);

    @PUT
    @Path("/update")
    Response update(EmployeeDTO employeeDTO);

    @DELETE
    @Path("/delete")
    Response delete(EmployeeDTO employeeDTO);

    @GET
    @Path("/findall")
    Response findAll();
}

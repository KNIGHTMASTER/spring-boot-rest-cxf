package com.zisal.springbootrestcxf.endpoint.impl;

import com.zisal.springbootrestcxf.dto.AllDataResponseDTO;
import com.zisal.springbootrestcxf.dto.EmployeeConverter;
import com.zisal.springbootrestcxf.dto.EmployeeDTO;
import com.zisal.springbootrestcxf.dto.ResponseData;
import com.zisal.springbootrestcxf.endpoint.IEmployeeEndPoint;
import com.zisal.springbootrestcxf.entity.Employee;
import com.zisal.springbootrestcxf.service.IEmployeeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created on 4/22/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Api("Employee EndPoint")
@Component
public class EmployeeEndPointImpl implements IEmployeeEndPoint {

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private EmployeeConverter employeeConverter;

    @Override
    public Response insert(EmployeeDTO employeeDTO) {
        employeeService.insert(employeeConverter.convert(employeeDTO));
        return Response.ok(new ResponseData("200", "Oke")).build();
    }

    @Override
    public Response update(EmployeeDTO employeeDTO) {
        employeeService.update(employeeConverter.convert(employeeDTO));
        return Response.ok(new ResponseData("200", "Oke")).build();
    }

    @Override
    public Response delete(EmployeeDTO employeeDTO) {
        employeeService.delete(employeeConverter.convert(employeeDTO));
        return Response.ok(new ResponseData("200", "Oke")).build();
    }

    @Override
    public Response findAll() {
        AllDataResponseDTO responseDTO = new AllDataResponseDTO();
        responseDTO.setResponseData(new ResponseData("200", "Oke"));
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();
        List<Employee> employees = employeeService.findAll();
        employeeDTOs.addAll(employees.stream().map(employeeConverter::invert).collect(Collectors.toList()));
        responseDTO.setContent(employeeDTOs);
        return Response.ok(responseDTO).build();
    }
}

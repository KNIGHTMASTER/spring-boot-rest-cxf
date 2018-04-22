package com.zisal.springbootrestcxf.dto;

import com.zisal.springbootrestcxf.entity.Employee;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

/**
 * Created on 4/22/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class EmployeeConverter implements Converter<EmployeeDTO, Employee> {
    @Override
    public Employee convert(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        if (employeeDTO.getId() != null) {
            employee.setId(employeeDTO.getId());
        }
        employee.setCode(employeeDTO.getCode());
        employee.setName(employeeDTO.getName());
        return employee;
    }

    public EmployeeDTO invert(Employee p_Employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(p_Employee.getId());
        employeeDTO.setCode(p_Employee.getCode());
        employeeDTO.setName(p_Employee.getName());
        return employeeDTO;
    }
}

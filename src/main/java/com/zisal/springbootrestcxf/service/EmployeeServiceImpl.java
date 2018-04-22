package com.zisal.springbootrestcxf.service;

import com.zisal.springbootrestcxf.dao.IEmployeeDAO;
import com.zisal.springbootrestcxf.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on 4/22/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeDAO employeeDAO;

    @Override
    public void insert(Employee p_Employee) {
        employeeDAO.save(p_Employee);
    }

    @Override
    public void update(Employee p_Employee) {
        employeeDAO.save(p_Employee);
    }

    @Override
    public void delete(Employee p_Employee) {
        employeeDAO.delete(p_Employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}

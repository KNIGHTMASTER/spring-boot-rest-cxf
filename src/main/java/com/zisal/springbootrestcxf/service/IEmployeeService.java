package com.zisal.springbootrestcxf.service;

import com.zisal.springbootrestcxf.entity.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created on 4/22/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface IEmployeeService {

    @Transactional
    void insert(Employee p_Employee);

    void update(Employee p_Employee);

    @Transactional
    void delete(Employee p_Employee);

    List<Employee> findAll();
}

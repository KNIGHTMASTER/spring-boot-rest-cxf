package com.zisal.springbootrestcxf.dao;

import com.zisal.springbootrestcxf.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on 4/22/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface IEmployeeDAO extends JpaRepository<Employee, Long> {
}

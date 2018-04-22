package com.zisal.springbootrestcxf.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created on 4/22/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "code", unique = true, length = 50)
    private String code;
    @Column(name = "name", length = 150)
    private String name;
}

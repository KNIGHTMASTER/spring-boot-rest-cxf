package com.zisal.springbootrestcxf.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created on 4/22/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Data
public class EmployeeDTO implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = -7755229086860850482L;

    private Long id;
    private String code;
    private String name;
}

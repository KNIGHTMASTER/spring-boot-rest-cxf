package com.zisal.springbootrestcxf.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 4/22/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Data
public class AllDataResponseDTO implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = 8007022868571169839L;
    private List<EmployeeDTO> content;
    private ResponseData responseData;
}

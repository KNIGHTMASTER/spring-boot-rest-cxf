package com.zisal.springbootrestcxf.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Created on 4/22/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Data
@AllArgsConstructor
public class ResponseData implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = -4543562519137375121L;
    private String code;
    private String message;
}

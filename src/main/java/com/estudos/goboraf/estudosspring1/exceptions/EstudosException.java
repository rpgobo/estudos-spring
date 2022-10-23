package com.estudos.goboraf.estudosspring1.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class EstudosException implements Serializable {
    private Date timestamp;
    private String message;
    private String details;


    public EstudosException(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}

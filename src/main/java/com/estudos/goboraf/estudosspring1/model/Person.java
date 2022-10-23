package com.estudos.goboraf.estudosspring1.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Person implements Serializable {

    private long id;
    private String firstName;
    private String lastName;
    private Address address;
    private String gender;

    public Person() {
    }
}

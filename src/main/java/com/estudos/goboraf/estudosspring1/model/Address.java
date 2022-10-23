package com.estudos.goboraf.estudosspring1.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Address {

    private String street;
    private String number;
    private String complement;
    private String district;
    private String city;
    private String state;
    private String country;
}

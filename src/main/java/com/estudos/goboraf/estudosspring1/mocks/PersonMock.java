package com.estudos.goboraf.estudosspring1.mocks;

import com.estudos.goboraf.estudosspring1.model.Address;
import com.estudos.goboraf.estudosspring1.model.Person;

public class PersonMock extends Person {


    public PersonMock() {
        this.setAddress(Address.builder()
                .street("Rua dos Americanos")
                .number("320")
                .complement("Apto 131")
                .city("São Bernardo do Campo")
                .state("SP")
                .country("Brazil")
                .build());
        this.setGender("Male");
        this.setFirstName("Rafael");
        this.setLastName("Gobo");
        this.setId(999999);
    }
}

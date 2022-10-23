package com.estudos.goboraf.estudosspring1.services;

import com.estudos.goboraf.estudosspring1.mocks.PersonMock;
import com.estudos.goboraf.estudosspring1.model.Person;
import com.estudos.goboraf.estudosspring1.utils.validations.ValidateUtils;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id){
        logger.info("Finding a person");

        if(ValidateUtils.isMock(id))
        return new PersonMock();

        return new Person();
    }
}

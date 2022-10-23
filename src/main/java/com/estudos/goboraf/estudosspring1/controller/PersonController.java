package com.estudos.goboraf.estudosspring1.controller;

import com.estudos.goboraf.estudosspring1.model.Person;
import com.estudos.goboraf.estudosspring1.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
public class PersonController {

    @Autowired
    private PersonServices personServices;

    @RequestMapping(value="/person/{id}", method = RequestMethod.GET)
    public Person findById(
            @PathVariable(value="id") String id){
        return personServices.findById(id);
    }

}

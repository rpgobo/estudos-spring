package com.estudos.goboraf.estudosspring1.controller;

import com.estudos.goboraf.estudosspring1.exceptions.UnsupportedMathOperationException;
import com.estudos.goboraf.estudosspring1.exceptions.messages.DefaultMessages;
import com.estudos.goboraf.estudosspring1.math.SimpleOperations;
import com.estudos.goboraf.estudosspring1.utils.validations.ValidateUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    SimpleOperations simpleOperations = new SimpleOperations();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double sum(@PathVariable(value="numberOne") String numberOne,
                      @PathVariable(value="numberTwo") String numberTwo){

        return simpleOperations.sum(numberOne,numberTwo);
    }

    @RequestMapping(value = "/subtract/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double subtract(@PathVariable(value="numberOne") String numberOne,
                      @PathVariable(value="numberTwo") String numberTwo){

        return simpleOperations.subtract(numberOne,numberTwo);
    }

    @RequestMapping(value = "/divide/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double divide(@PathVariable(value="numberOne") String numberOne,
                           @PathVariable(value="numberTwo") String numberTwo){

        return simpleOperations.divide(numberOne,numberTwo);
    }

    @RequestMapping(value = "/multiply/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double multiply(@PathVariable(value="numberOne") String numberOne,
                           @PathVariable(value="numberTwo") String numberTwo){

        return simpleOperations.multiply(numberOne,numberTwo);
    }
}

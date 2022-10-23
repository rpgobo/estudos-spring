package com.estudos.goboraf.estudosspring1.controller;

import com.estudos.goboraf.estudosspring1.exceptions.UnsupportedMathOperationException;
import com.estudos.goboraf.estudosspring1.utils.validations.ValidateUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double sum(@PathVariable(value="numberOne") String numberOne,
                      @PathVariable(value="numberTwo") String numberTwo){
        if(!ValidateUtils.isNumeric(numberOne) || !ValidateUtils.isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("One or more non-numeric values. NumberOne: " + numberOne + ", NumberTwo: " + numberTwo);

        return Double.valueOf(numberOne) + Double.valueOf(numberTwo);
    }
}

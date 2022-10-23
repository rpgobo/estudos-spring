package com.estudos.goboraf.estudosspring1.math;

import com.estudos.goboraf.estudosspring1.exceptions.UnsupportedMathOperationException;
import com.estudos.goboraf.estudosspring1.exceptions.messages.DefaultMessages;
import com.estudos.goboraf.estudosspring1.utils.validations.ValidateUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SimpleOperations {

    public Double sum(String numberOne, String numberTwo){
        if(ValidateUtils.isNumeric(Arrays.asList(numberOne,numberTwo)))
            return Double.valueOf(numberOne) + Double.valueOf(numberTwo);
        throw new UnsupportedMathOperationException(DefaultMessages.NON_NUMERIC_EXCPETION_MESSAGE);
    }

    public Double subtract(String numberOne, String numberTwo){
        if(ValidateUtils.isNumeric(Arrays.asList(numberOne,numberTwo)))
            return Double.valueOf(numberOne) - Double.valueOf(numberTwo);
        throw new UnsupportedMathOperationException(DefaultMessages.NON_NUMERIC_EXCPETION_MESSAGE);
    }

    public Double multiply(String numberOne, String numberTwo){
        if(ValidateUtils.isNumeric(Arrays.asList(numberOne,numberTwo)))
            return Double.valueOf(numberOne) * Double.valueOf(numberTwo);
        throw new UnsupportedMathOperationException(DefaultMessages.NON_NUMERIC_EXCPETION_MESSAGE);
    }

    public Double divide(String numberOne, String numberTwo){
        if(ValidateUtils.isNumeric(Arrays.asList(numberOne,numberTwo)))
            return Double.valueOf(numberOne) / Double.valueOf(numberTwo);
        throw new UnsupportedMathOperationException(DefaultMessages.NON_NUMERIC_EXCPETION_MESSAGE);
    }
}

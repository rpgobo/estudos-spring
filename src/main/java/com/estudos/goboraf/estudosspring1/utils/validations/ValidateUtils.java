package com.estudos.goboraf.estudosspring1.utils.validations;

import java.util.List;

public class ValidateUtils {

    public static boolean isNumeric(List<String> numbers){
        try{
            numbers.parallelStream().forEach(number -> {
                var toNumber = Double.valueOf(number);
            });
           return true;
        }
        catch (Exception ex){
            return false;
        }

    }
}

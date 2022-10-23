package com.estudos.goboraf.estudosspring1.utils.validations;

public class ValidateUtils {

    public static boolean isNumeric(String number){
        try{
           var toNumber = Double.valueOf(number);
           return true;
        }
        catch (Exception ex){
            return false;
        }

    }
}

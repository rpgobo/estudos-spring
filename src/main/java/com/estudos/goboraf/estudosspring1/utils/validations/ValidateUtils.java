package com.estudos.goboraf.estudosspring1.utils.validations;

import com.estudos.goboraf.estudosspring1.utils.constants.ConstantStrings;

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

    public static boolean isMock(String mock){
        if (mock.equals(ConstantStrings.CONSTANT_STRINGS_MOCK))
            return true;
        return false;
    }
}

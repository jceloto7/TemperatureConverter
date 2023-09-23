package com.masterj723.temperature_converter.Util;

import org.apache.commons.lang3.math.NumberUtils;

import java.text.DecimalFormat;

import static com.masterj723.temperature_converter.Util.InputUtil.getInput;

public class ValidationUtil {

    public static double validationDouble (String stringCelsius ){
        boolean validation;
        boolean loop =true;
        double doubleCelsius = 0;

        validation = NumberUtils.isParsable(stringCelsius);
        while (loop){
            if(!validation){
                System.out.println("""
                Invalid temperature.Please just type numbers.
                If you want to use decimal cases, please use '.'.""");
                stringCelsius = getInput();
                validation = NumberUtils.isParsable(stringCelsius);

            } else{
                loop= false;
                doubleCelsius = Double.parseDouble(stringCelsius);
            }
        }
        return doubleCelsius;

    }

    public static int validationInt(String stringOption){
        boolean validation;
        boolean loop = true;
        int intOption = 0;
        int intOptionError;
        validation = NumberUtils.isParsable(stringOption);

        while(loop){
            if(!validation){
                System.out.println("Invalid option.Please just type 1 or 2");
                stringOption = getInput();
                validation = NumberUtils.isParsable(stringOption);
            } else if (validation) {
                intOptionError = Integer.parseInt(stringOption);
                if (intOptionError != 1 || intOption != 2) {
                    System.out.println("Invalid option.Please just type 1 or 2");
                    stringOption = getInput();
                    validation = NumberUtils.isParsable(stringOption);
                    intOption = Integer.parseInt(stringOption);
                }
            }
            else {
                loop = false;
                intOption = Integer.parseInt(stringOption);
            }
        }

        return intOption;

    }


}

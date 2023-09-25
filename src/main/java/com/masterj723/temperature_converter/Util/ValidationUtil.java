package com.masterj723.temperature_converter.Util;

import org.apache.commons.lang3.math.NumberUtils;
public class ValidationUtil {

    public double validationDouble (String stringCelsius ){
        boolean validation;
        boolean loop =true;
        double doubleCelsius = 0;
        InputUtil inputUtil = new InputUtil();

        validation = NumberUtils.isParsable(stringCelsius);
        while (loop){
            if(!validation){
                System.out.println("""
                Invalid temperature.Please just type numbers.
                If you want to use decimal cases, please use '.'.""");
                stringCelsius = inputUtil.getInput();
                validation = NumberUtils.isParsable(stringCelsius);

            } else{
                loop= false;
                doubleCelsius = Double.parseDouble(stringCelsius);
            }
        }
        return doubleCelsius;

    }

    public int validationInt(String stringOption){
        ValidationUtil validationUtil = new ValidationUtil();
        InputUtil inputUtil = new InputUtil();
        double checkDouble;
        int intOption;

        checkDouble= validationUtil.validationIntAux(stringOption);

        while(checkDouble != 1 && checkDouble !=2){
                System.out.println("Invalid option.Please just type 1 or 2:");
                stringOption = inputUtil.getInput();
                checkDouble = validationUtil.validationIntAux(stringOption);
            }

        intOption = (int)checkDouble;
        return intOption;

    }

    public double validationIntAux (String stringOption ){
        boolean validation;
        boolean loop =true;
        double doubleOption = 0;
        InputUtil inputUtil = new InputUtil();

        validation = NumberUtils.isParsable(stringOption);
        while (loop){
            if(!validation){
                System.out.println("Invalid option.Please just type 1 or 2:");
                stringOption = inputUtil.getInput();
                validation = NumberUtils.isParsable(stringOption);

            } else{
                loop= false;
                doubleOption = Double.parseDouble(stringOption);
            }
        }
        return doubleOption;

    }




    }



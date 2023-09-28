package com.jceloto7.temperature_converter.Util;

import org.apache.commons.lang3.math.NumberUtils;
public class ValidationUtil {
    private final InputUtil inputUtil;

    public ValidationUtil(InputUtil inputUtil){
        this.inputUtil = inputUtil;
    }

    public double validationDouble(String stringCelsius) {
        boolean validation;
        boolean loop = true;
        double doubleCelsius = 0;

        validation = NumberUtils.isParsable(stringCelsius);
        while (loop) {
            if (!validation) {
                System.out.println("Invalid temperature. Please just type numbers.");
                stringCelsius = inputUtil.getInput();
                validation = NumberUtils.isParsable(stringCelsius);

            } else {
                loop = false;
                doubleCelsius = Double.parseDouble(stringCelsius);
            }
        }
        return doubleCelsius;

    }

    public char validationChar(String stringOption) {
        char[] charOption = stringOption.toCharArray();

        while (charOption.length > 1 || charOption[0] != '1' && charOption[0] != '2') {
            System.out.println("Invalid option.Please just type 1 or 2:");
            stringOption = inputUtil.getInput();
            charOption = stringOption.toCharArray();
        }
        return charOption[0];

    }
}



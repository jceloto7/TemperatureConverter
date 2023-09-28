package com.jceloto7.temperature_converter.Util;

import java.text.DecimalFormat;

public class FormatNumberUtil {
    public double formatDouble(double number){
        double numberFormatted;

        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        numberFormatted = Double.parseDouble(decimalFormat.format(number));

        return numberFormatted;
    }
}

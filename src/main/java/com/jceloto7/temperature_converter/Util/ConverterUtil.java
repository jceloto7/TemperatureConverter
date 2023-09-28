package com.jceloto7.temperature_converter.Util;

public class ConverterUtil {

    public static double converter(double doubleCelsius) {
        double fahrenheit;

        fahrenheit = (doubleCelsius * 1.8) + 32;
        return fahrenheit;
    }
}


package com.masterj723.temperature_converter.Util;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.util.Locale.US;

public class ConverterUtil {

    public static double converter(double doubleCelsius) {
        double fahrenheit;
        fahrenheit = (doubleCelsius * 1.8) + 32;
        return fahrenheit;
    }
}


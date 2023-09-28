package com.jceloto7.temperature_converter;

import com.jceloto7.temperature_converter.Util.*;
public class TemperatureConverter {
    public static void main(String[] args) {
        String stringCelsius;
        InputUtil inputUtil = new InputUtil();
        ValidationUtil validationUtil = new ValidationUtil(inputUtil);
        double doubleCelsius;
        double doubleCelsiusFormatted;
        FormatNumberUtil formatNumberUtil = new FormatNumberUtil();
        double fahrenheit;
        double fahrenheitFormatted;
        char charOption = '1';

        System.out.println("Hello! Welcome to the Temperature Converter.");
        while (charOption == '1') {
            try {
                System.out.println("Please,type a temperature in Celsius (C): ");
                stringCelsius = inputUtil.getInput();
                doubleCelsius = validationUtil.validationDouble(stringCelsius);
                doubleCelsiusFormatted = formatNumberUtil.formatDouble(doubleCelsius);
                fahrenheit = ConverterUtil.converter(doubleCelsius);
                fahrenheitFormatted = formatNumberUtil.formatDouble(fahrenheit);
                System.out.println(doubleCelsiusFormatted + " degrees Celsius is  " +
                                    fahrenheitFormatted + " degrees in Fahrenheit.");
                System.out.println("""
                        Do you want to make a new conversion?
                        Please type 1 to 'yes' or 2 to 'no'.""");
                String stringOption = inputUtil.getInput();
                charOption = validationUtil.validationChar(stringOption);
            } catch (Exception ex) {
                System.out.println("An unexpected error has occurred. Please try again");
            }
        }

        inputUtil.closeScanner();
        System.out.println("""
                    Thanks for using the TemperatureConverter ^^
                    Bye.""");
    }

}




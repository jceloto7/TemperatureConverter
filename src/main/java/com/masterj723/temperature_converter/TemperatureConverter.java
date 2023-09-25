package com.masterj723.temperature_converter;


import com.masterj723.temperature_converter.Util.ConverterUtil;
import com.masterj723.temperature_converter.Util.InputUtil;
import com.masterj723.temperature_converter.Util.ValidationUtil;

//Additional exercise: Accept brazilian sample (,)

public class TemperatureConverter {
    public static void main(String[] args) {
        InputUtil inputUtil = new InputUtil();
        ValidationUtil validationUtil = new ValidationUtil();
        int intOption = 1;

        System.out.println("Hello! Welcome to the Temperature Converter.");
        while (intOption == 1) {
            System.out.println("Please,type a temperature in Celsius (C): ");
            String stringCelsius = inputUtil.getInput();
            double doubleCelsius = validationUtil.validationDouble(stringCelsius);
            double fahrenheit = ConverterUtil.converter(doubleCelsius);
            System.out.println(doubleCelsius + " degrees Celsius is " + fahrenheit + " degrees in Fahrenheit.");
            System.out.println("""
                    Do you want to make a new conversion?
                    Please type 1 to 'yes' or 2 to 'no'.""");
            String stringOption = inputUtil.getInput();
            intOption = validationUtil.validationInt(stringOption);
        }
        System.out.println("""
                Thanks for using the TemperatureConverter ^^
                Bye.""");

    }

}



package com.jceloto7.temperature_converter.Util;

import java.util.Scanner;

public class InputUtil {
    private final Scanner scanner;

    public InputUtil(){
        scanner = new Scanner(System.in);
    }

    public String getInput() {
        String stringCelsius;
        stringCelsius = scanner.next();
        return stringCelsius.replace(',','.');
    }

    public void closeScanner(){
        scanner.close();
    }



}

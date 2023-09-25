package com.masterj723.temperature_converter.Util;

import java.util.Scanner;
import static java.util.Locale.US;

public class InputUtil {

    public  String getInput() {
        String stringCelsius = "";
        boolean loop = true;
        while (loop) {
            try {
                Scanner scanner = new Scanner(System.in).useLocale(US);
                stringCelsius = scanner.next();
                loop = false;
                scanner.reset();
                return stringCelsius;
            } catch (Exception ex) {
                System.out.println("An unexpected error has occurred. Please try again");
            }
        }
        return stringCelsius;
    }



}

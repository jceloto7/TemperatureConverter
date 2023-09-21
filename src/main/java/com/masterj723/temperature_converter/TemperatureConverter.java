package com.masterj723.temperature_converter;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.commons.lang3.math.NumberUtils;
import static java.util.Locale.*;

//Additional exercise: Ask if the user wants to make a new conversion.
//Additional exercise: Accept brazilian sample (,)
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scannerMain = new Scanner(System.in).useLocale(US);
        int answerFinal;
        boolean validationMain = true;
        System.out.println("""
                Hello! Welcolme to the Temperature Converter.
                Please, type a temperature in Celsius (C):
                """);
        converterAux();
        System.out.println("""
                Do you want to make a new conversion?
                Please type 1 to "yes" or 2 to "no".""");
        loopAux();
        answerFinal = loopAux();
        loopOrEnd(answerFinal);
    }


    public static float converter(float celsius) {
        float fahrenheit;
        fahrenheit = (float) ((celsius * 1.8) + 32);
        return fahrenheit;
    }

    public static void converterAux() {
        float celsius;
        float convertedTemperature;
        boolean validation = true;

        while (validation) {
            try {
                Scanner scannerConverter = new Scanner(System.in).useLocale(US);
                celsius = scannerConverter.nextFloat();
                convertedTemperature = converter(celsius);
                System.out.println(celsius + " degrees Celsius is " + convertedTemperature + " degrees in Fahrenheit.");
                validation = false;
                scannerConverter.reset();
            } catch (InputMismatchException IMex) {
                System.err.println("""
                        Invalid temperature.Please just type numbers.
                        If you want to use decimal cases, please use '.'.
                        """);
            } catch (Exception ex) {
                System.err.println("""
                        An unexpected error occurred.
                        Please try again.""");

            }
        }
        System.out.println();

    }

    public static void loopOrEnd(int answerFinal) {
        while (answerFinal == 1) {
            System.out.println("Please, type a temperature in Celsius (C)");
            converterAux();
            System.out.println("""
                    Do you want to make a new conversion?
                    Please type 1 to "yes" or 2 to "no". """);
            answerFinal = loopAux();
        }
        if (answerFinal == 2) {
            System.out.println("""
                    Thanks for using Temperature Converter ^^
                    Bye.""");
        }
    }

    public static int loopAux() {
        boolean validation2 = true;
        int answer = 0;

        while (validation2) {
            try {
                Scanner scannerLoopAux = new Scanner(System.in);
                answer = scannerLoopAux.nextInt();
                while (answer < 1 && answer > 2) {
                    System.out.println("Invalid option. Please just type 1 or 2");
                    answer = scannerLoopAux.nextInt();
                }
                validation2 = false;
                scannerLoopAux.reset();
                return answer;
            } catch (InputMismatchException IMex) {
                System.out.println("Invalid option. Please just type 1 or 2");
                return 0;
            } catch (Exception ex) {
                System.out.println("""
                        An unexpected error occurred.
                        Please try again.""");
                return 0;
            }

        }
        return answer;
    }

}




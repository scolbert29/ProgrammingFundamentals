package com.colbert.conditional;

import java.util.Scanner;

public class HasAFever {
    public static void main(String[] args) {
        double temperature;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your temperature in Celsius: ");
        temperature = userInput.nextDouble();

        if (temperature < 39) {
            System.out.println("You don't have fever!");
        } else {
            if (temperature >= 39);
            System.out.println("You have a fever");
        }
    }

}

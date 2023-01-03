package com.colbert.calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int num1, num2;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = userInput.nextInt();

        System.out.println("Enter second number: ");
        num2 = userInput.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and" + num2 + " is " + sum);

        int difference = num1 - num2;
        System.out.println("The difference of " + num1 + " and " + num2 + " is " + difference);

        int product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);

        int average = sum / 2;
        System.out.println("The average of " + num1 + " and " + num2 + " is " + average);

        int distance = Math.abs(num1 - num2);
        System.out.println("Difference between the two: " + distance);

        int maximum = Math.max(num1, num2);
        System.out.println("Largest integer: " + maximum);

        int minimum = Math.min(num1, num2);
        System.out.println("Smallest number: " + minimum);
    }
}

package com.colbert.calculator;

import java.util.Scanner;

public class DifferenceBetweenTwoNumbers {
    public static void main(String[] args) {
        int num1, num2;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please provide the first number: ");
        num1 = userInput.nextInt();

        System.out.println("Please provide the second number: ");
        num2 = userInput.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        if (num1 > num2) {
            difference =  num1 - num2;
        } else {
            difference =  num1 - num2;
        }
        System.out.println("The difference between " + num1 + " and " + num2  + " is " + difference);

    }
}

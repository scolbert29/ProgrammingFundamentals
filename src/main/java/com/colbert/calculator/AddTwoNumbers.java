package com.colbert.calculator;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int num1, num2;

        System.out.println("Hello, This is my simple calculator that adds two numbers: ");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please provide the first number: ");
        num1 = userInput.nextInt();

        System.out.println("Please provide the second number: ");
        num2 = userInput.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2  + " is " + sum);
    }
}

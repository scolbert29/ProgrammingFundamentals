package com.colbert.calculator;

import java.util.Scanner;

public class SubtractTwoNumbers {
    public static void main(String[] args) {
        int num1, num2;

        System.out.println("Hello, This is my simple calculator that subtracts two numbers: ");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please provide the first number: ");
        num1 = userInput.nextInt();

        System.out.println("Please provide the second number: ");
        num2 = userInput.nextInt();

        int diff = num1 - num2;
        System.out.println("The difference of " + num1 + " and " + num2  + " is " + diff);
    }
}

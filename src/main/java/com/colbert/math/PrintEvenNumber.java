package com.colbert.math;
public class PrintEvenNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to the program that prints all even numbers between 1 and 100\n" +
                "\n");
        for(int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            }
        }
    }
}

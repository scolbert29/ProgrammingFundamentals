package com.colbert.game;

import java.util.Scanner;

public class NumberGuessingGameOneTry {
    public static void main(String[] args) {
        int number =  (int) ((Math.random() * (100 - 1)) + 1);
        int guess;

        System.out.println("Welcome to the number guessing game!");

        Scanner userInput = new Scanner(System.in);

        // Generate a random

        System.out.println("A number is chosen between 1 to 100. Guess the number within 1 trial. ");
        System.out.println("Guess a number between 1 and 100: ");

        guess = userInput.nextInt();

        System.out.println("The random number is: " + number);
        // guessing game conditions
        if (guess > number) {
            System.out.println("Too high");
        } else if (guess < number) {
            System.out.println("Too low");
        } else {
            System.out.println("Congratulations! You guessed the number ");
        }

        System.out.println("Game Over!");
    }
}

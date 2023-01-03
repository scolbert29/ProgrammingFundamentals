package com.colbert.game;

import java.util.Scanner;

public class PaperRockScissors {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissors! ");

        int i = 1;
        while (i > 0) {
            // Generate a random
            int number = (int) ((Math.random() * (4 - 1)) + 1);

            Scanner userInput = new Scanner(System.in);
            System.out.println("What is your move? To make a move, enter rock, paper, or scissors: ");
            String usersMove = userInput.nextLine();

            // Check if user's input is valid
            if (usersMove.equalsIgnoreCase("rock")
                    || usersMove.equalsIgnoreCase("paper")
                    || usersMove.equalsIgnoreCase("scissors")) {
                System.out.println("This is a valid move.");
            } else if (usersMove.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.println("Your move is not valid. ");
            }

            String opponentMove;
            if (number == 1) {
                opponentMove = "rock";
            } else if (number == 2) {
                opponentMove = "scissors";
            } else {
                opponentMove = "paper";
            }

            // Results of the game
            if (usersMove.equalsIgnoreCase(opponentMove)) {
                System.out.println("It's a tie! ");
            } else if (((usersMove.equalsIgnoreCase("rock")) && (opponentMove.equalsIgnoreCase("scissors")))
                || ((usersMove.equalsIgnoreCase("paper")) && (opponentMove.equalsIgnoreCase("rock")))
                || (((usersMove.equalsIgnoreCase("scissors")) && (opponentMove.equalsIgnoreCase("paper"))))) {
                System.out.println("You won!");
            } else {
                System.out.println("You lost!");
            }
        }
    }
}

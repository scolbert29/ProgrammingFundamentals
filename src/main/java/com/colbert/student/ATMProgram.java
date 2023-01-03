package com.colbert.student;

import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {
        int balance = 5000, withdraw, deposit; // declare variables
        Scanner userInput = new Scanner(System.in); // create Scanner object
        while(true) {
            System.out.println("Automated Teller Machine: ");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform: ");
            int n = userInput.nextInt();
            switch (n) {
                case 1 -> { // withdraw money
                    System.out.println("Enter money to be withdrawn: ");
                    withdraw = userInput.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Collect your money and receipt. ");
                    } else {
                        System.out.println("Insufficient funds");
                    }
                    System.out.println("");
                }
                case 2 -> { // deposit money
                    System.out.println("Enter money to be deposited: ");
                    deposit = userInput.nextInt();
                    balance = balance + deposit;
                    System.out.println("Deposit collected. Take your receipt. ");
                    System.out.println("");
                }
                case 3 -> { // show balance
                    System.out.println("Balance: " + balance);
                    System.out.println("");
                }
                case 4 -> // exit
                        System.exit(0);
            }
        }
    }
}

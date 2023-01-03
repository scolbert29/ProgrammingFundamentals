package com.colbert.loan;

public class SimpleCarLoanPaymentCalculator {
    public static void main(String[] args) {
        // initial values
        int InitialCarLoan = 20000;
        int InitialLoanLength = 3;
        double InterestRate = .03;
        int InitialDownPayment = 3000;

        // validation

        // paid in full conditions
        if (InitialDownPayment == InitialCarLoan) {
            System.out.println("The car loan is paid in full");
        } else {
            System.out.println("The car loan is not paid in full");
        }

        // car loan monthly payment calculation


    }
}

package com.colbert.dailyexercises;

import java.util.Arrays;

public class JavaMethodExercisesOne {
    public static void main(String[] args) {
        JavaMethodExercisesOne methods = new JavaMethodExercisesOne();
        System.out.println(methods.addTwoNumbers(25, 5));
        System.out.println(methods.subtractTwoNumbers(30, 20));
        String[] studentNames = {"James", "Lauren", "Tracy"};
        methods.hello(studentNames);
        System.out.println("Is Over 30: " + methods.isOver30(34));
        int[] numbers = {7, 12, 15, 30};
        System.out.println(methods.sum(numbers));
        System.out.println(methods.different(23, 25));
        // String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(methods.dayOfWeek(3));
        System.out.println(methods.oddNumbers(35));
        System.out.println(methods.evenNumbers(36));
        System.out.println(methods.upperCase("my name is samaria"));
        System.out.println(methods.numberOfItems(studentNames));
        System.out.println(methods.greaterThan10(numbers));
        System.out.println(methods.lessThan10(numbers));
        System.out.println(methods.toArray(23, 29, 40));
        numbers = new int[]{3, 5, 8, 9};
        System.out.println(methods.print(numbers));
        int[] setOne = {2, 5, 7, 18};
        int[] setTwo = {2, 19, 5, 8};
        System.out.println(methods.larger(setOne, setTwo));
    }

    public int addTwoNumbers(int numberOne, int numberTwo) { // A method that adds two numbers
        int sum = numberOne + numberTwo;
        return sum;
    }


    public int subtractTwoNumbers(int numberOne, int numberTwo) { // A method that subtracts two numbers
        int difference = numberTwo - numberOne;
        return difference;
    }

    public void hello (String[] studentNames) { // A method that says hello to each student
        for(String studentName : studentNames) {
            System.out.println("Hello " + studentName);
        }
    }

    public boolean isOver30(int age) { // A method that tells if the age is over 30
        boolean isOver30 = false;
        if(age > 30) {
            isOver30 = true;
        }
        return isOver30;
    }

    public int sum (int[] numbers) { // A method that provides a sum off the numbers provided
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

    // A method that returns the absolute difference between two numbers
    public int different(int numberOne, int numberTwo) {
        if(numberOne < numberTwo) {
            return (Math.abs(numberOne - numberTwo));
        } else {
            return numberOne - numberTwo;
        }
    }
    // A method that returns the day of the week for a number between 1 and 7
    public String dayOfWeek(int number) {
        String dayOfWeek = null;

        if (number == 1) {
            dayOfWeek = "Sunday";
        } else if (number == 2) {
            dayOfWeek = "Monday";
        } else if (number == 3) {
            dayOfWeek = "Tuesday";
        } else if (number == 4) {
            dayOfWeek = "Wednesday";
        } else if (number == 5) {
            dayOfWeek = "Thursday";
        } else if (number == 6) {
            dayOfWeek = "Friday";
        } else {
            dayOfWeek = "Saturday";
        }
        return dayOfWeek;
    }

    // A method that returns all the odd numbers between 1 and a number
    public int oddNumbers(int upperLimit) {
        int oddNumbers;
        for (oddNumbers = 1; oddNumbers <= upperLimit; oddNumbers++) {
            if (oddNumbers % 2 == 0) {
                System.out.println(oddNumbers + " is an odd number. ");
            }
        }
        return oddNumbers;
    }

    // A method that returns all the even numbers between 1 and a number
    public int evenNumbers (int upperLimit) {
        int evenNumbers;
        for (evenNumbers = 1; evenNumbers <= upperLimit; evenNumbers++) {
            if (evenNumbers % 2 == 0) {
                System.out.println(evenNumbers + " is an even number. ");
            }
        }
        return evenNumbers;
    }
    // A method that converts text to upperCase
    public String upperCase (String text) {
        String upperCase = " ";
        System.out.println(text.toUpperCase());
        return upperCase;
    }
    // A method that returns the total number of students
    public int numberOfItems(String[] studentNames) {
        return studentNames.length;
    }
    // A method that returns count of numbers that are greater than 10
    public int greaterThan10 (int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10) {
                count = count + 1;
            }
        }
        return count;
    }
    // A method that returns count of numbers that are less than 10
    public int lessThan10 (int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 10) {
                count = count + 1;
            }
        }
        return count;
    }
    // A method converts three numbers to an array of int
    public String toArray(int numberOne, int numberTwo, int numberThree) {
        int[] array = {numberOne, numberTwo, numberThree};
        return Arrays.toString(array);
    }
    // A method that prints all the numbers on separate lines
    public int print(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
        return 0;
    }

    // A method that returns the array with larger sum
    public String larger (int[] setOne, int[] setTwo) {
        int sumOne = 0;
        int sumTwo = 0;
        for (int number : setOne) {
            sumOne = sumOne + number;
        }
        for (int number : setTwo) {
            sumTwo = sumTwo + number;
        }
        if (sumOne > sumTwo) {
            return Arrays.toString(setOne);
        } else if (sumOne < sumTwo) {
            return Arrays.toString(setTwo);
        } else {
            return null;
        }
    }
}

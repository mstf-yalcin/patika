package com.patika.java101;

import java.util.Scanner;

public class HesapMakinesi {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        System.out.println("Enter numbers to add (Enter 0 to finish):");
        while (true) {
            System.out.print("Number " + i++ + ": ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result: " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print("Number " + i + ": ");
            number = scan.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            result -= number;
        }
        System.out.println("Result: " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;
        System.out.println("Enter numbers to multiply (Enter 1 to finish):");
        while (true) {
            System.out.print("Number " + i++ + ": ");
            number = scan.nextInt();
            if (number == 1) break;
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Result: " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print("Number " + i + ": ");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot divide by zero.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Result: " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int base = scan.nextInt();
        System.out.print("Enter exponent value: ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Result: " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scan.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            System.out.println("Result: " + (number % divisor));
        }
    }

    static void rectangle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter long side: ");
        int longSide = scan.nextInt();
        System.out.print("Enter short side: ");
        int shortSide = scan.nextInt();

        if (longSide <= 0 || shortSide <= 0) {
            System.out.println("Side lengths must be greater than zero.");
        } else {
            System.out.println("Area: " + (longSide * shortSide));
            System.out.println("Perimeter: " + (2 * (longSide + shortSide)));
        }
    }

    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Power Calculation\n"
                + "6- Factorial\n"
                + "7- Modulo\n"
                + "8- Rectangle Area and Perimeter\n"
                + "0- Exit";

        do {
            System.out.println("--------------------------------");
            System.out.println(menu);
            System.out.print("Please select an operation: ");
            select = scan.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection, please try again.");
            }
        } while (select != 0);
    }
}

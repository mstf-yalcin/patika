package com.patika.java101;

import java.util.Scanner;

public class RecursiveAsal {
    static boolean isPrime(int number, int i) {

        if (number < 2)
            return false;

        if (i == number)
            return true;

        if (number % i == 0)
            return false;

        return isPrime(number, i + 1);
    }

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (isPrime(number, 2))
            System.out.println(number + " is PRIME.");
        else
            System.out.println(number + " is NOT PRIME.");

        input.close();
    }
}

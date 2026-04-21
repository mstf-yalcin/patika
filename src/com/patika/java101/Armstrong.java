package com.patika.java101;

import java.util.Scanner;

public class Armstrong {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int tempNumber = number;
        int digitCount = 0;
        int result = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCount++;
        }

        tempNumber = number;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;

            int power = 1;
            for (int i = 1; i <= digitCount; i++) {
                power *= digit;
            }

            result += power;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }


        int sum = 0;
        tempNumber = number;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sum += digit;
            tempNumber /= 10;
        }

        System.out.println("Sum of digits: " + sum);

        input.close();
    }
}

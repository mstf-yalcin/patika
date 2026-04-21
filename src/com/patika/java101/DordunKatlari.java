package com.patika.java101;

import java.util.Scanner;

public class DordunKatlari {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number % 4 == 0) {
                sum += number;
            }

        } while (number > 0);

        System.out.println("Sum: " + sum);

        scanner.close();
    }
}

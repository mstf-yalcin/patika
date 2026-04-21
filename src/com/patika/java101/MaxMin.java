package com.patika.java101;

import java.util.Scanner;

public class MaxMin {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter: ");
        int n = input.nextInt();

        int number;
        int max;
        int min;

        System.out.print("1st number: ");
        number = input.nextInt();

        max = number;
        min = number;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". number: ");
            number = input.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);

        input.close();
    }
}

package com.patika.java101;

import java.util.Scanner;

public class UsluSayi {
    static void main() {
        int n, k;
        Scanner input = new Scanner(System.in);

        System.out.println("Base number: ");
        n = input.nextInt();

        System.out.println("Exponent: ");
        k = input.nextInt();

        int totalWhile = 1;
        int i = 1;

        while (i <= k) {
            totalWhile *= n;
            i++;
        }

        System.out.println("Result (while): " + totalWhile);

        int totalFor = 1;

        for (int j = 1; j <= k; j++) {
            totalFor *= n;
        }

        System.out.println("Result (for): " + totalFor);

        input.close();
    }

}

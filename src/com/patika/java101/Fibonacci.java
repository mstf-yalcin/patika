package com.patika.java101;

import java.util.Scanner;

public class Fibonacci {

    static int recursive(int n) {
        if (n <= 1) {
            return n;
        }
        return recursive(n - 1) + recursive(n - 2);
    }

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of fibonacci: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 1; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");

            a = b;
            b = c;
        }

    }
}

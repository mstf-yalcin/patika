package com.patika.java101;

import java.util.Scanner;

public class RecursiveDesen {
    static void pattern(int n) {

        System.out.print(n + " ");

        if (n <= 0) {
            return;
        }

        pattern(n - 5);

        System.out.print(n + " ");
    }

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        pattern(n);

        input.close();
    }
}

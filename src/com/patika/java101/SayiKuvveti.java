package com.patika.java101;

import java.util.Scanner;

public class SayiKuvveti {
    static void main() {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter limit: ");
        n = input.nextInt();

        System.out.println("Powers of 2:");
        for (int i = 1; i <= n; i *= 2) {
            System.out.println(i);
        }

        System.out.println("Powers of 4:");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Powers of 5:");
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }

    }
}

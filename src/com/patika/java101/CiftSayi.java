package com.patika.java101;

import java.util.Scanner;

public class CiftSayi {
    static void main() {
        int k;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}

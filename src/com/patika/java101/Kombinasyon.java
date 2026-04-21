package com.patika.java101;

import java.util.Scanner;

public class Kombinasyon {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.print("Enter r: ");
        int r = input.nextInt();

        int nFact = 1;
        int rFact = 1;
        int nrFact = 1;

        // n!
        for (int i = 1; i <= n; i++) {
            nFact *= i;
        }


        // r!
        for (int i = 1; i <= r; i++) {
            rFact *= i;
        }

        // (n-r)!
        for (int i = 1; i <= (n - r); i++) {
            nrFact *= i;
        }

        int combination = nFact / (rFact * nrFact);

        System.out.println("C(" + n + "," + r + ") = " + combination);

    }
}

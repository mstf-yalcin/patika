package com.patika.java101;

import java.util.Scanner;

public class TersUcgen {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of rows: ");
        int n = input.nextInt();

        int i = n;

        while (i >= 1) {

            int j = 1;

            while (j <= (2 * i - 1)) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i--;
        }

        input.close();
    }
}

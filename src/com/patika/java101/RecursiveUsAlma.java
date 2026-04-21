package com.patika.java101;

import java.util.Scanner;

public class RecursiveUsAlma {
    static int power(int base, int exponent) {

        if (exponent == 0)
            return 1;

        return base * power(base, exponent - 1);
    }

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Base value: ");
        int base = input.nextInt();

        System.out.print("Exponent value: ");
        int exponent = input.nextInt();

        int result = power(base, exponent);

        System.out.println("Result: " + result);

        input.close();
    }
}

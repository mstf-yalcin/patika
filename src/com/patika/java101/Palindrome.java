package com.patika.java101;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrom(int number) {
        String s1 = String.valueOf(number);
        String s2 = new StringBuilder(s1).reverse().toString();

        return s1.equals(s2);
    }

    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int i = input.nextInt();

        System.out.println(isPalindrom(i));
    }
}

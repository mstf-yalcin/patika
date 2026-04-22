package com.patika.java101;

import java.util.Scanner;

public class MaxMin2 {
    static void main() {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int smallerClosest = Integer.MIN_VALUE;
        int biggerClosest = Integer.MAX_VALUE;

        for (int i : list) {

            if (i < number && i > smallerClosest) {
                smallerClosest = i;
            }

            if (i > number && i < biggerClosest) {
                biggerClosest = i;
            }
        }

        System.out.println("Entered number: " + number);
        System.out.println("Closest smaller number: " + smallerClosest);
        System.out.println("Closest larger number: " + biggerClosest);
    }
}

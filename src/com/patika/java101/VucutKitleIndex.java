package com.patika.java101;

import java.util.Scanner;

public class VucutKitleIndex {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        double height, weight, bmi;

        System.out.print("Enter your height (in meters): ");
        height = scanner.nextDouble();

        System.out.print("Enter your weight (in kg): ");
        weight = scanner.nextDouble();

        bmi = weight / (height * height);

        System.out.println("Your Body Mass Index: " + bmi);

        scanner.close();
    }
}

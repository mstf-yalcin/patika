package com.patika.java101;

import java.util.Scanner;

public class UcakBileti {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance (KM): ");
        int distance = input.nextInt();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter trip type (1 => One Way, 2 => Round Trip): ");
        int type = input.nextInt();

        if (distance <= 0 || age <= 0 || (type != 1 && type != 2)) {
            System.out.println("Invalid Input!");
        } else {

            double price = distance * 0.10;

            if (age < 12) {
                price *= 0.50;
            } else if (age <= 24) {
                price *= 0.90;
            } else if (age > 65) {
                price *= 0.70;
            }

            if (type == 2) {
                price = (price * 0.80) * 2;
            }

            System.out.println("Total Price = " + price + " TL");
        }

        input.close();
    }
}

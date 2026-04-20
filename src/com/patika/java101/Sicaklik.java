package com.patika.java101;

import java.util.Scanner;

public class Sicaklik {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temp = input.nextInt();

        if (temp < 5) {
            System.out.println("Skiing");
        } else if (temp <= 15) {
            System.out.println("Cinema");
        } else if (temp <= 25) {
            System.out.println("Picnic");
        } else {
            System.out.println("Swimming");
        }

        input.close();
    }
}

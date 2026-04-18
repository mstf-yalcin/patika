package com.patika.java101;

import java.util.Scanner;

public class ManavKasa {
    static void main() {
        Scanner input = new Scanner(System.in);

        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;

        System.out.print("How many kg of pears? : ");
        double pearKg = input.nextDouble();

        System.out.print("How many kg of apples? : ");
        double appleKg = input.nextDouble();

        System.out.print("How many kg of tomatoes? : ");
        double tomatoKg = input.nextDouble();

        System.out.print("How many kg of bananas? : ");
        double bananaKg = input.nextDouble();

        System.out.print("How many kg of eggplants? : ");
        double eggplantKg = input.nextDouble();

        double total = (pearKg * pearPrice) + (appleKg * applePrice) + (tomatoKg * tomatoPrice)
                + (bananaKg * bananaPrice) + (eggplantKg * eggplantPrice);

        System.out.println("Total Price: " + total + " TL");

        input.close();
    }
}

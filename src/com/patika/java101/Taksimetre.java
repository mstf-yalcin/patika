package com.patika.java101;

import java.util.Scanner;

public class Taksimetre {
    static void main() {
        Scanner input = new Scanner(System.in);

        double perKm = 2.20;
        double openingFee = 10;
        double minimumFare = 20;

        System.out.print("Enter distance (km): ");
        double km = input.nextDouble();

        double total = openingFee + (km * perKm);

        total = (total < minimumFare) ? minimumFare : total;

        System.out.println("Total fee: " + total + " TL");

        input.close();
    }
}

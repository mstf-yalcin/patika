package com.patika.java101;

import java.util.Scanner;

public class KDV {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        double vatRate = (amount >= 0 && amount <= 1000) ? 0.18 : 0.08;

        double vatAmount = amount * vatRate;
        double totalPrice = amount + vatAmount;

        System.out.println("Price without VAT: " + amount);
        System.out.println("VAT Rate: " + (vatRate * 100) + "%");
        System.out.println("VAT Amount: " + vatAmount);
        System.out.println("Price with VAT: " + totalPrice);

        input.close();
    }
}

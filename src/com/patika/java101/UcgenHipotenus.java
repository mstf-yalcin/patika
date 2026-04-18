package com.patika.java101;

import java.util.Scanner;

public class UcgenHipotenus {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = input.nextInt();

        System.out.print("Enter second side: ");
        int b = input.nextInt();

        double hypotenuse = Math.sqrt(a * a + b * b);

        System.out.println("Hypotenuse: " + hypotenuse);

        System.out.print("\nEnter third side: ");
        int c = input.nextInt();

        double u = (a + b + c) / 2;
        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Triangle Area: " + area);

        input.close();
    }
}

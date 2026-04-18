package com.patika.java101;

import java.util.Scanner;

public class DaireAlan {
    static void main() {
        double radius, area, circumference;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        radius = input.nextDouble();

        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;

        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);

        input.close();
    }
}

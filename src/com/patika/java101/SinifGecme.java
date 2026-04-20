package com.patika.java101;

import java.util.Scanner;

public class SinifGecme {
    static void main() {
        Scanner input = new Scanner(System.in);

        int math, physics, turkish, chemistry, music;
        float sum = 0;
        float counter = 0;
        float avg;

        System.out.print("Enter Math grade: ");
        math = input.nextInt();

        if (math >= 0 && math <= 100) {
            sum = sum + math;
            counter = counter + 1;
        } else {
            sum = sum + 0;
            counter = counter + 0;
            System.out.println("Invalid number entered.");
            System.out.println("Please enter a number between 0 and 100.");
        }

        System.out.print("Enter Physics grade: ");
        physics = input.nextInt();

        if (physics >= 0 && physics <= 100) {
            sum = sum + physics;
            counter++;
        } else {
            sum = sum + 0;
            counter = counter + 0;
            System.out.println("Invalid number entered.");
            System.out.println("Please enter a number between 0 and 100.");
        }

        System.out.print("Enter Turkish grade: ");
        turkish = input.nextInt();

        if (turkish >= 0 && turkish <= 100) {
            sum += turkish;
            counter++;
        } else {
            sum = sum + 0;
            counter = counter + 0;
            System.out.println("Invalid number entered.");
            System.out.println("Please enter a number between 0 and 100.");
        }

        System.out.print("Enter Chemistry grade: ");
        chemistry = input.nextInt();

        if (chemistry >= 0 && chemistry <= 100) {
            sum += chemistry;
            counter++;
        } else {
            sum = sum + 0;
            counter = counter + 0;
            System.out.println("Invalid number entered.");
            System.out.println("Please enter a number between 0 and 100.");
        }

        System.out.print("Enter Music grade: ");
        music = input.nextInt();

        if (music >= 0 && music <= 100) {
            sum += music;
            counter++;
        } else {
            sum = sum + 0;
            counter = counter + 0;
            System.out.println("Invalid number entered.");
            System.out.println("Please enter a number between 0 and 100.");
        }

        avg = sum / counter;

        System.out.println("Average: " + avg);

        if (avg >= 55)
            System.out.println("You passed!");
        else
            System.out.println("You failed");

        input.close();
    }
}

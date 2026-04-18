package com.patika.java101;

import java.util.Scanner;

public class NotOrtalama {
    static void main() {
        Scanner input = new Scanner(System.in);

        int math, physics, chemistry, turkish, history, music;

        System.out.print("Math grade: ");
        math = input.nextInt();

        System.out.print("Physics grade: ");
        physics = input.nextInt();

        System.out.print("Chemistry grade: ");
        chemistry = input.nextInt();

        System.out.print("Turkish grade: ");
        turkish = input.nextInt();

        System.out.print("History grade: ");
        history = input.nextInt();

        System.out.print("Music grade: ");
        music = input.nextInt();

        double average = (math + physics + chemistry + turkish + history + music) / 6;

        String result = average > 60 ? "Passed the class" : "Failed the class";

        System.out.println("Your average: " + average);
        System.out.println(result);

        input.close();
    }
}

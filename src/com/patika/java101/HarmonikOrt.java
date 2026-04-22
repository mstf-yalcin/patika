package com.patika.java101;

public class HarmonikOrt {
    static void main() {
        int[] numbers = {1, 2, 3, 4, 5};

        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum += 1.0 / numbers[i];
        }

        double harmonicAverage = numbers.length / sum;

        System.out.println("Harmonic Mean: " + harmonicAverage);
    }
}

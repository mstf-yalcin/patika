package com.patika.java101;

public class Asal {

    static void main() {
        for (int i = 2; i <= 100; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}


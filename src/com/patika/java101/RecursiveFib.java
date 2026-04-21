package com.patika.java101;

public class RecursiveFib {
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static void main() {

        System.out.println(fib(5));

    }
}

package com.patika.java101.mayintarlasi;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int row, col;

        System.out.println("Welcome to the MineSweeper Game!");

        while (true) {
            System.out.print("Please enter the number of rows (Min 2): ");
            row = scanner.nextInt();
            System.out.print("Please enter the number of columns (Min 2): ");
            col = scanner.nextInt();

            if (row >= 2 && col >= 2) {
                break;
            } else {
                System.out.println("Error: Matrix size must be at least 2x2. Please enter valid values!\n");
            }
        }

        MineSweeper game = new MineSweeper(row, col);
        game.run();
    }
}

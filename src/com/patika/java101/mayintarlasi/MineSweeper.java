package com.patika.java101.mayintarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    private int rowNumber;
    private int colNumber;
    private String[][] mineMap;
    private String[][] gameMap;
    private int mineCount;
    private int openedCells;
    private boolean isGameOver;
    private Scanner scanner;

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mineMap = new String[rowNumber][colNumber];
        this.gameMap = new String[rowNumber][colNumber];
        this.mineCount = (rowNumber * colNumber) / 4;
        this.openedCells = 0;
        this.isGameOver = false;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        initializeMaps();
        placeMines();

        System.out.println("Location of Mines");
        printMap(mineMap);
        System.out.println("===========================");
        System.out.println("Welcome to the MineSweeper Game!");

        while (!isGameOver) {
            printMap(gameMap);
            System.out.print("Enter Row : ");
            int r = scanner.nextInt();
            System.out.print("Enter Column : ");
            int c = scanner.nextInt();
            System.out.println("===========================");

            playTurn(r, c);

            if (openedCells == (rowNumber * colNumber) - mineCount) {
                System.out.println("You Won the Game!");
                printMap(gameMap);
                System.out.println("===========================");
                isGameOver = true;
            }
        }
    }

    private void initializeMaps() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                mineMap[i][j] = "-";
                gameMap[i][j] = "-";
            }
        }
    }

    private void placeMines() {
        Random rand = new Random();
        int count = 0;

        while (count < mineCount) {
            int randRow = rand.nextInt(rowNumber);
            int randCol = rand.nextInt(colNumber);

            if (!mineMap[randRow][randCol].equals("*")) {
                mineMap[randRow][randCol] = "*";
                count++;
            }
        }
    }

    private void printMap(String[][] map) {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void playTurn(int r, int c) {
        if (r < 0 || r >= rowNumber || c < 0 || c >= colNumber) {
            System.out.println("Invalid input! The coordinates you selected are outside the board boundaries. Please try again.");
            return;
        }

        if (!gameMap[r][c].equals("-")) {
            System.out.println("This coordinate has already been selected, please enter a different coordinate.");
            return;
        }

        if (mineMap[r][c].equals("*")) {
            System.out.println("Game Over!");
            isGameOver = true;
            return;
        }

        int adjacentMines = countAdjacentMines(r, c);
        gameMap[r][c] = String.valueOf(adjacentMines);
        openedCells++;
    }

    private int countAdjacentMines(int r, int c) {
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = r + i;
                int newCol = c + j;

                if (newRow >= 0 && newRow < rowNumber && newCol >= 0 && newCol < colNumber) {
                    if (mineMap[newRow][newCol].equals("*")) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}


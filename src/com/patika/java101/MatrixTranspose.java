package com.patika.java101;

public class MatrixTranspose {
    static void main() {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }

        System.out.println("Transpose : ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + "    ");
            }
            System.out.println();
        }
    }
}

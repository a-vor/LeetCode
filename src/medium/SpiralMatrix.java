package medium;

import java.util.Scanner;

/*
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
*/

public class SpiralMatrix {
    public static void main(String[] args) {
        outputMatrix(generateMatrix(new Scanner(System.in).nextInt()));
    }

    private static void outputMatrix(int[][] matrix) {
        if (matrix == null)
            System.out.println((String) null);
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        if (n < 1 || n > 20)
            return null;
        int[][] matrix = new int[n][n];
        int number = 1, temp = 0;

        while (number <= n * n) {
            for (int i = temp; i < n - temp; i++) {
                matrix[temp][i] = number++;
            }
            number--;
            for (int i = temp; i < n - temp; i++)
                matrix[i][n - 1 - temp] = number++;
            number--;
            for (int i = n - 1 - temp; i >= temp; i--)
                matrix[n - 1 - temp][i] = number++;
            number--;
            for (int i = n - 1 - temp; i > temp; i--)
                matrix[i][temp] = number++;
            temp++;
        }
        return matrix;
    }
}

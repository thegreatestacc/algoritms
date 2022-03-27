package com.sovliv.tasks.easy;

/**
 * https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
 *
 * @author Vladimir Solovyov
 * @project Algorithms
 * @date on 22/03/2022
 */

public class Staircase {
    public static void main(String[] args) {
        staircase(5);
    }

    public static void staircase(int n) {
        char[][] matrix = new char[n][n];
        char[][] mirrorMatrix = new char[n][n];

        //fill matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int col = matrix[row].length - 1; col >= 0; col--) {
                matrix[row][col] = row < col ? ' ' : '#';
            }
        }

        //display initial matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //create mirror matrix
        for (int row = 0; row < n; row++) {
            int imageColumn = 0;
            for (int col = n - 1; col >= 0 ; col--) {
                char element = matrix[row][col];
                mirrorMatrix[row][imageColumn] = element;
                imageColumn++;
            }
        }

        //display mirrored matrix
        for (int i = 0; i < mirrorMatrix.length; i++) {
            char[] row = mirrorMatrix[i];
            for (int j = 0; j < row.length; j++) {
                char element = mirrorMatrix[i][j];
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

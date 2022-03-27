package com.sovliv.tasks.easy;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true
 * @author Vladimir Solovyov
 * @project Algorithms
 * @date on 22/03/2022
 */

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> incomeList = List.of(
                List.of(11, 2, 4),
                List.of(4, 5, 6),
                List.of(10, 8, -12));
        System.out.println(diagonalDifference(incomeList));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstLine = 0;
        int secondLine = 0;

        for (int i = 0; i < arr.size(); i++) {
            firstLine += arr.get(i).get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            secondLine += arr.get(i).get((arr.size() - 1) - i);
        }

        return Math.abs(firstLine - secondLine);
    }
}

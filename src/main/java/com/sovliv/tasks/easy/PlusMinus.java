package com.sovliv.tasks.easy;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
 *
 * @author Vladimir Solovyov
 * @project Algorithms
 * @date on 22/03/2022
 */

public class PlusMinus {
    public static void main(String[] args) {
        final var incomeList = List.of(-4, 3, -9, 0, 4, 1);
        plusMinus(incomeList);
    }

    public static void plusMinus(List<Integer> arr) {
        var positive = 0;
        var negative = 0;
        var zero = 0;
        double arrSize = arr.size();
        for (Integer element : arr) {
            if (element > 0) positive++;
            if (element < 0) negative++;
            if (element == 0) zero++;
        }

        var positiveResult = String.format("%6f", positive / arrSize);
        var negativeResult = String.format("%6f", negative / arrSize);
        var zeroResult = String.format("%6f", zero / arrSize);

        System.out.println(positiveResult + "\n" + negativeResult + "\n" + zeroResult);
    }

}

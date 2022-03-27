package com.sovliv.tasks.easy;

import java.util.List;

/**
 * Task https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true
 * @author Vladimir Solovyov
 * @project Algorithms
 * @date on 22/03/2022
 */

public class SimpleArraySum {
    public static void main(String[] args) {
        final int sum = simpleArraySum(List.of(1, 3, 4));
        System.out.println(sum);
    }

    public static int simpleArraySum(List<Integer> ar) {
        int result = 0;
        for (Integer i : ar) {
            result += i;
        }
        return result;
    }
}

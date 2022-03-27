package com.sovliv.tasks.easy;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true
 * @author Vladimir Solovyov
 * @project Algorithms
 * @date on 22/03/2022
 */

public class AVeryBigSum {
    public static void main(String[] args) {
        final long result = aVeryBigSum(List.of(555L, 555L,111L));
        System.out.println(result);
    }

    /**
     * Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
     *
     * aVeryBigSum has the following parameter(s):
     *
     * int ar[n]: an array of integers .
     * Return
     *
     * long: the sum of all array elements
     * Input Format
     *
     * The first line of the input consists of an integer .
     * The next line contains  space-separated integers contained in the array.
     *
     * Output Format
     *
     * Return the integer sum of the elements in the array.
     * @param ar
     * @return
     */

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum = 0;

        for (Long element : ar) {
            sum += element;
        }
        return sum;
    }
}

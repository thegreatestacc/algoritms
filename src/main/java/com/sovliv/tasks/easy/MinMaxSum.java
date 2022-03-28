package com.sovliv.tasks.easy;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
 *
 * @author Vladimir Solovyov
 * @project Algorithms
 * @date on 27/03/2022
 */

public class MinMaxSum {
    public static void main(String[] args) {
        minMaxSum(List.of(256741038, 623958417, 467905213, 714532089, 938071625));
    }

    public static void minMaxSum(List<Integer> list) {

        int minElem = list.get(0);
        int maxElem = list.get(0);

        //find min and max elements
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < minElem) {
                minElem = list.get(i);
            }
            if (list.get(i) > maxElem) {
                maxElem = list.get(i);
            }
        }

        //get sum of all elements
        long sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        //get min sum
        long minSum = sum - maxElem;
        long maxSum = sum - minElem;

        System.out.println(minSum + " " + maxSum);
    }
}

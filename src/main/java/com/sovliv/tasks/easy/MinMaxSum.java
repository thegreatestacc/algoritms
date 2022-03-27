package com.sovliv.tasks.easy;

import java.math.BigInteger;
import java.util.ArrayList;
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
//        minMaxSum(List.of(3, 1, 5, 7, 2));
    }

    public static void minMaxSum(List<Integer> list) {

        //TODO not resolved

        int minElem = list.get(0);
        int maxElem = list.get(0);

        List<BigInteger> bigIntegers = new ArrayList<>();

        //find min and max elements
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < minElem) {
                minElem = list.get(i);
            }
            if (list.get(i) > maxElem) {
                maxElem = list.get(i);
            }
        }

        //convert income Integer list to BigInteger
        for (int i = 0; i < list.size(); i++) {
            bigIntegers.add(BigInteger.valueOf(list.get(i)));
        }

        final BigInteger maxElement = bigIntegers.stream().max(BigInteger::compareTo).orElseThrow();
        final BigInteger minElement = bigIntegers.stream().min(BigInteger::compareTo).orElseThrow();

        //get sum of all elements
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < list.size(); i++) {
            sum.add(BigInteger.valueOf(list.get(i)));
        }



        System.out.println("sum is " + sum);

        //get min sum
        BigInteger castMinElem = BigInteger.valueOf(minElem);
        BigInteger castMaxElem = BigInteger.valueOf(maxElem);

        final BigInteger maxSum = sum.subtract(castMinElem);
        final BigInteger minSum = sum.subtract(castMaxElem);

        final String s = maxSum.toString();
        final String s1 = minSum.toString();

//        System.out.println(s, s1);

//        BigInteger minSum = BigInteger.valueOf(sum.subtract(BigInteger.valueOf(maxElem)));
//        BigInteger maxSum = BigInteger.valueOf(sum - minElem);

/*        System.out.println(minSum + " " + maxSum);

        System.out.printf("min sum is %s, max sum is %s", minSum, maxSum);*/


        //this method doesn't work with large numbers
        /*int minElem = list.get(0);
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
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        //get min sum
        int minSum = sum - maxElem;
        int maxSum = sum - minElem;

        System.out.println(minSum + " " + maxSum);*/
    }
}

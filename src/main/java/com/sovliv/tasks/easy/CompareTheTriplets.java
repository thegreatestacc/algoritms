package com.sovliv.tasks.easy;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
 *
 * @author Vladimir Solovyov
 * @project Algorithms
 * @date on 22/03/2022
 */

public class CompareTheTriplets {

    public static void main(String[] args) {
        final List<Integer> result = compareTriplets(List.of(1, 2, 3), List.of(3, 2, 1));
        result.forEach(System.out::println);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceResult = 0;
        int bobResult = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i).equals(b.get(i))) {
                continue;
            }
            if (a.get(i) > b.get(i)) {
                aliceResult++;
            }
            if (a.get(i) < b.get(i)) {
                bobResult++;
            }
        }
        return List.of(aliceResult, bobResult);
    }
}

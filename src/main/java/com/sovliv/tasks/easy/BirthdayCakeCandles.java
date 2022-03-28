package com.sovliv.tasks.easy;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
 *
 * @author Vladimir Solovyov
 * @project Algorithms
 * @date on 28/03/2022
 */

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        birthdayCakeCandles(List.of(2, 3, 4, 0, 4));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {

        int maxNumber = 0;
        int count = 0;

        for (int i = 0; i < candles.size(); i++) {
            if (maxNumber < candles.get(i)) {
                maxNumber = candles.get(i);
            }
        }

        for (int i = 0; i < candles.size(); i++) {
            if (maxNumber == candles.get(i)) {
                count++;
            }
        }

        System.out.println(count);

        return count;
    }
}

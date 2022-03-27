package com.sovliv.tasks.easy;

import java.util.Scanner;

/**
 * Task https://www.hackerrank.com/challenges/solve-me-first/problem?isFullScreen=true
 * @author Vladimir Solovyov
 * @project Algorithms
 * @date on 22/03/2022
 */

public class SolveMeFirst {

    public static void main(String[] args) {
        final int result = sum();
        System.out.println(result);
    }

    public static int sum() {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a >= 1 && b <= 1000) {
            return a + b;
        }
        return 0;
    }
}

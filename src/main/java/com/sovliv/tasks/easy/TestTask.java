package com.sovliv.tasks.easy;

/**
 * @author Vladimir Solovyov
 * @project Algorithms
 * @date on 22/03/2022
 */

public class TestTask {
    public static void main(String[] args) {
        fizzBuzz(121);
    }

    public static void fizzBuzz(int n) {
        for (int i = 0; i < n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
            if ((i % 3 == 0) && (i % 5 != 0)) {
                System.out.println("Fizz");
            }
            if ((i % 3 != 0) && (i % 5 == 0)) {
                System.out.println("Buzz");
            }
            if ((i % 3 != 0) && (i % 5 != 0)) {
                System.out.println(i);
            }
        }
    }
}

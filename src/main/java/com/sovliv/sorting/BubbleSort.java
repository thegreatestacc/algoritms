package com.sovliv.sorting;

/**
 * @author Vladimir Solovyov
 * @project Algorithms
 * @date on 23/05/2022
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {56, 46, 86, 65, 80, 30, 96, 2, 89, 49, 78, 56, 68, 39, 0, 88, 66, 51, 65, 1};

        printArray(arr);
        System.out.println();
        sortArray(arr);
        System.out.println();
        printArray(arr);
    }

    public static void sortArray(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                    isSorted = false;
                }
            }
            System.out.println(" ");
            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

}

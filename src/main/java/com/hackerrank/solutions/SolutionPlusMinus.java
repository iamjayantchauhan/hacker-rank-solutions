package com.hackerrank.solutions;

/*
 * Solution for this problem
 *
 * https://www.hackerrank.com/challenges/plus-minus/problem
 *
 **/

import java.util.Scanner;

public class SolutionPlusMinus {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the plusMinus function below.
    private static void plusMinus(int[] arr) {
        int plusRatio = 0;
        int minusRatio = 0;
        int zeroRatio = 0;

        for (int x : arr) {
            if (x > 0)
                plusRatio += 1;
            else if (x < 0)
                minusRatio += 1;
            else
                zeroRatio += 1;
        }

        System.out.println(String.format("%.6f", (double) plusRatio / arr.length));
        System.out.println(String.format("%.6f", (double) minusRatio / arr.length));
        System.out.println(String.format("%.6f", (double) zeroRatio / arr.length));
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

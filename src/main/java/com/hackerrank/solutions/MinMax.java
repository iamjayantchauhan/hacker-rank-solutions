package com.hackerrank.solutions;

/*
 *  Solution for this problem
 *
 *  https://www.hackerrank.com/challenges/mini-max-sum/problem
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMax {

    // Complete the miniMaxSum function below.
    private static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long lowerSum = 0;
        long higherSum = 0;

        for (int i = 0; i < 4; i++) {
            lowerSum = lowerSum + arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            higherSum = higherSum + arr[i];
        }

        System.out.println(lowerSum + " " + higherSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}


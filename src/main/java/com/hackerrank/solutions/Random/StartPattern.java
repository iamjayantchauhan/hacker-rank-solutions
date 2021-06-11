package com.hackerrank.solutions.Random;

public class StartPattern {
    public static void main(String[] args) {
        int elementLength = 5;

        for (int i = 1; i <= elementLength; i++) {
            for (int j = 0; j < elementLength - i; j++)
                System.out.print(" ");

            for (int k = 0; k < i * 2 - 1; k++)
                System.out.print("*");

            System.out.println();
        }

        int space = 1;

        for (int i = elementLength; i > 1; i--) {
            for (int k = 0; k < space; k++)
                System.out.print(" ");

            for (int j = 0; j < i * 2 - 3; j++)
                System.out.print("*");

            System.out.println();
            space++;
        }
    }
}

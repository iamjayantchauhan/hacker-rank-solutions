package com.hackerrank.solutions.Random;

class A {
    void test() {
        System.out.println("This is from class A Test");
    }
}

class B extends A {
    void methodOne() {
        System.out.println("This is from B method one");
    }

    void methodTwo() {
        System.out.println("This is from B method two");
    }
}

public class InheritanceProblem {
    public static void main(String[] args) {
        A a = new B();

    }
}

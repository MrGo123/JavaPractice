package com.junitpra;

public class Hello {
    public static void speak() {
        System.out.println("hello JUnit");
    }

    public static long fact(long n) {
        long r = 1;
        for (long i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }
}

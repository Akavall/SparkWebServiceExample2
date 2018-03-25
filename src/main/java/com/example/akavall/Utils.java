package com.example.akavall;

public class Utils {
    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        long limit = (long)Math.sqrt(n) + 1;

        for (int i = 3; i < limit; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

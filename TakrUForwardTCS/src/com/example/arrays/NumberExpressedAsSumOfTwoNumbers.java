package com.example.arrays;

public class NumberExpressedAsSumOfTwoNumbers {
    public static void main(String[] args) {
        int n = 79;
        System.out.println(isPrimeSum(n));
    }

    private static boolean isPrimeSum(int n) {
        for (int i = 0; i <= n; i++) {
            if (isPrime(n - i) && isPrime(i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

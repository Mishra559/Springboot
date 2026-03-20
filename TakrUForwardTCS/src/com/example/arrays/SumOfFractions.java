package com.example.arrays;

public class SumOfFractions {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 1;
        int d = 7;

        int lcm = (b*d)/gcd(b,d);

        int numerator = (a*(lcm/b)) + (c*(lcm/d));
        int denominator = lcm;

        System.out.println(numerator);
        System.out.println(denominator);



    }

    private static int gcd(int b, int d) {
        while (d != 0) {
            int temp = d;
            d = b % d;
            b = temp;
        }
        return b;
    }
}

package com.example.arrays;

public class ReplaceAllZeroesWithOne {
    public static void main(String[] args) {
        int n = 1154000001;

        int sum = 0;
        while (n > 0) {
            int rem = n % 10;

            if(rem == 0) {
                rem = 1;
            }

            sum = sum*10 + rem;
            n = n / 10;
        }

        int rev = 0;
        while (sum > 0) {
            int rem = sum % 10;
            rev = rev*10 + rem;
            sum = sum / 10;
        }

        System.out.println(rev);

    }
}

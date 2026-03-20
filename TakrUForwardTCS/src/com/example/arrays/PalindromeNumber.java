package com.example.arrays;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 1555737351;
        int temp = n;

        int rev = 0;

        while (temp > 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == n){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }

}

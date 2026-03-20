package com.example.arrays;

public class PalindromeInAGivenRange {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;

        for(int i=a;i<=b;i++){
            if(isPalindrome(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPalindrome(int i) {
        int temp = i;

        int rev = 0;

        while (temp > 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == i) return true;

        return false;

    }
}


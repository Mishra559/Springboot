package com.example.arrays;

public class Permutation {
    public static void main(String[] args) {
        int n = 5;
        int r = 3;

        long permutation = factorial(n)/factorial(n-r);
        System.out.println(permutation);
    }

    public static long factorial(int n){
        long result = 1;
        for(int i = 1; i<=n; i++){
            result *= i;
        }
        return result;
    }
}

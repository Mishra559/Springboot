package com.example.arrays;

import static com.example.arrays.Permutation.factorial;

public class SoldierProblem {
    public static void main(String[] args) {
        int[] arr = {1,6,4,8,5,4,9,7};

        int n = arr.length;
        long arrangements = factorial(n-2);
        System.out.println(arrangements );
    }
}

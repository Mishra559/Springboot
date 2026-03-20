package com.example.arrays;

import java.util.Arrays;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n =  arr.length;

        int sum = Arrays.stream(arr).sum();
        int avg = sum/n;
        System.out.println(avg);
    }
}

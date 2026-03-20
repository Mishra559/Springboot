package com.example.arrays;

import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {

        int[] arr = {1,5,8,7,9,6,4,7};

        int n = arr.length;

        Arrays.sort(arr);

        System.out.println("The median of array is : " + arr[(n+1)/2]);

    }
}

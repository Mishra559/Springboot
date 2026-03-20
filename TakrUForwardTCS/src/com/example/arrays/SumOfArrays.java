package com.example.arrays;

import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        int[] arr = {1,5,8,7,9,6,4,7};

        int sum = 0;

        for(int a:arr){
            sum+=a;
        }
        System.out.println(sum);
    }
}

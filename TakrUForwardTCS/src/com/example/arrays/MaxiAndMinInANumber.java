package com.example.arrays;

import java.util.Scanner;

public class MaxiAndMinInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(n>0){
            int digit = n%10;
            max = Math.max(max,digit);
            min = Math.min(min,digit);
            n=n/10;
        }
        System.out.println(max);
        System.out.println(min);
    }
}

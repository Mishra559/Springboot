package com.example.arrays;

import java.util.Scanner;

public class SumOfAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        double d = sc.nextDouble();
        int n  = sc.nextInt();

        double sum = 0;
        double term = a;

        for(int i = 0; i<n; i++){
            sum = sum + term;
            term = term * d;
        }

        System.out.println(sum);
    }
}

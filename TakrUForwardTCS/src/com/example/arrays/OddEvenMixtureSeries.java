package com.example.arrays;

import java.util.Scanner;

public class OddEvenMixtureSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double x = 0;

        if(n%2==0){
            System.out.println("The nth term is ");
            x = 1 * Math.pow(3,(n-1)/2);
        }
        else{
            System.out.println("The nth term is ");
            x = 1 * Math.pow(2,n/2-1);
        }

        System.out.println(x);
    }
}

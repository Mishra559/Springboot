package com.example.arrays;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp = n;

        String str= String.valueOf(n);
        int count = str.length();

        double sum = 0;

        while(n>0){
            int d =  n%10;
            sum = sum + Math.pow(d,count);
            n=n/10;
        }

        if(sum == temp){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}

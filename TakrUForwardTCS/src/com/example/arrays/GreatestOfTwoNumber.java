package com.example.arrays;

import java.util.Scanner;

public class GreatestOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a + " is Greater Than " + b);
        }
        else{
            System.out.println(b + " is Greater Than " + a);
        }
    }
}

package com.example.arrays;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        int sq = n * n;

        int count = 0;
        while(temp > 0){
            temp = temp / 10;
            count++;
        }

        int m = 1;

        for(int i = 0; i<count; i++){
            m = m*10;
        }

        if(sq % m == n){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not Automorphic Number");
        }
    }
}

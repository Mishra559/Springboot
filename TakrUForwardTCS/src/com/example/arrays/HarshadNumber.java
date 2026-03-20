package com.example.arrays;

public class HarshadNumber {
    public static void main(String[] args) {
        int n = 379;

        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        }
        if(n % sum == 0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not Harshad Number");
        }
    }
}

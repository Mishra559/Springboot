package com.example.arrays;

public class PrimeMethod {
    public static void main(String[] args) {

       int a = 10;
       int b = 200;

       for(int i=a;i<=b;i++){
           if(isPrime(i)){
               System.out.println(i);
           }
       }

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) { return  false; }
        }
        return true;
    }
}

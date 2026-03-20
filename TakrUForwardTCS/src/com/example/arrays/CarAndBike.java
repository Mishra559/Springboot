package com.example.arrays;

import java.util.Scanner;

public class CarAndBike {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        int w = scan.nextInt();

        if(w%2 != 0 || w < 2*v || w > 4 * v){
            System.out.println("Invalid Input");
        }

        else {
            int bike = 0;
            int car = 0;

            car = (w/2) - v;
            bike = 2*v - w/2;
            System.out.println(bike);
            System.out.println(car);
        }
    }
}

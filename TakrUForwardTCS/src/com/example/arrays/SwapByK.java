package com.example.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the value of k ");
        int k = sc.nextInt();

        swap(arr,0,k-1);
        swap(arr,k,arr.length-1);
        swap(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    private static void swap(int[] arr, int a, int b){
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}

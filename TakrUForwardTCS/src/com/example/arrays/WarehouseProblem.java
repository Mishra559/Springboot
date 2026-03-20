package com.example.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WarehouseProblem {
    public static void main(String[] args) {
        int[] arr = {14,20,45,20,80,70,36,45,90};

        int i = arr.length-1;
        for(int j = arr.length-1;j>=0;j--){
            if(arr[j]%10==0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    }


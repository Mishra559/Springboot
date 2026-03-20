package com.example.arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,5,0,2,0,4,4,0,3,6,7,5};

        int i =  0;
        for(int j=0;j<arr.length;j++){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

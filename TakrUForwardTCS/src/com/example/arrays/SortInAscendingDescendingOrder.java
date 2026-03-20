package com.example.arrays;

import java.util.Arrays;

public class SortInAscendingDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {1,5,8,7,9,6,4,7};

        Arrays.sort(arr);
        int n = arr.length;

        int i = n/2;
        int j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

}

package com.example.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        int[] arr = {1,1,1,1,1,5,5,5,8,5,8,1,6,4,7,5};
        Arrays.sort(arr);

//        Set<Integer> set = new LinkedHashSet<Integer>();
//
//        for(int a:arr){
//            set.add(a);
//        }
//
//        int[] arr2 = new int[set.size()];
//        int i = 0;
//
//        for (int a:set){
//            arr2[i]=a;
//            i++;
//        }
//
//        System.out.println(Arrays.toString(arr2));

        int j = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }

        for(int i = j+1; i < arr.length; i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

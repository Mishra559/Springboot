package com.example.arrays;

import java.util.Arrays;

public class InsertInDifferentPositions {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
       int[] begin = insertAtBeginning(arr,6);
        System.out.println(Arrays.toString(begin));
       int[] end = insertAtEnding(arr,7);
        System.out.println(Arrays.toString(end));
       int[] middle = insertAtPosition(arr,4,7);
        System.out.println(Arrays.toString(middle));
    }

    private static int[] insertAtPosition(int[] arr, int index, int i) {
        int[] newArr = new int[arr.length+1];
        for(int j=0;j<index;j++){
            newArr[j] = arr[j];
        }
        newArr[index] = i;
        for(int j=index+1;j<newArr.length;j++){
            newArr[j] = arr[j-1];
        }
        return newArr;


    }

    private static int[] insertAtEnding(int[] arr, int i) {
        int[] newArr = new int[arr.length+1];
        for(int j=0;j<arr.length;j++){
            newArr[j] = arr[j];
        }
        newArr[arr.length] = i;
        return newArr;
    }

    private static int[] insertAtBeginning(int[] arr, int beginning){
        int[] newArr = new int[arr.length+1];
        newArr[0] = beginning;
        for(int i=1;i<newArr.length;i++){
            newArr[i] = arr[i-1];
        }
        return newArr;
    }
}

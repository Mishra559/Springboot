package com.example.arrays;

/* You are given a dynamic string "Sumit Kumar Mahato".
 Replace the 7th and 8th characters with '1' and '2' respectively.
 */

public class Replacement {
    public static void main(String[] args) {
        String str = "Sumit Kumar Mahato";
        char[] arr = str.toCharArray();
        arr[7] ='1';
        arr[8] ='2';
        str = new String(arr);
        System.out.println(str);
    }
}

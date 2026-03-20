package com.example.arrays;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class CountTheFrequency {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,5,5,5,8,5,8,1,6,4,7,5};
//        boolean[] arr2 = new boolean[arr.length];
//
//        for(int i=0;i<arr.length - 1;i++){
//            if(arr2[i] == false){
//                int count = 1;
//                arr2[i] = true;
//                for(int j=i+1;j<arr.length;j++){
//                    if(arr[j]==arr[i] && arr2[j] == false){
//                        count++;
//                        arr2[j] =  true;
//                    }
//                }
//                System.out.println(arr[i] + " " + count);
//
//            }
//
//        }


        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        map.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
    }
}

    package com.example.arrays;

    public class SmallestElement {
        public static void main(String[] args) {
            int[] arr = {5,1,2};

            int min = Integer.MAX_VALUE;
            int secondMin = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                   int temp = min;
                   min = arr[i];
                   secondMin = temp;
                }

                if(arr[i]<secondMin && arr[i]!=min){
                    secondMin = arr[i];
                }
            }
            System.out.println(min);
            System.out.println(secondMin);
        }
    }

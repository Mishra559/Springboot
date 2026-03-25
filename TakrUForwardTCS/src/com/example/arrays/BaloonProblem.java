package com.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BaloonProblem {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        Scanner sc = new Scanner(System.in);



        System.out.println("Enter to total number for people ");
        String str = br.readLine();
        int n = Integer.parseInt(str);

        System.out.println("Enter the max weight");
        String str1 = br.readLine();
        int W = Integer.parseInt(str1);

        int[] arr = new int[n];
        System.out.println("Enter the weight of the people");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = maxPeopleFit(arr,W);
        System.out.println(x + " people fit");
    }
    public static int maxPeopleFit(int[] arr,int W) {

        Arrays.sort(arr);


        int n = arr.length;
        int maxCount = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if(sum+arr[i]<=W){
                sum+=arr[i];
                maxCount++;
            }
            else{
                break;
            }
        }

        return maxCount;

    }
}

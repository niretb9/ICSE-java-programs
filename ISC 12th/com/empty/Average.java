package com.empty;
import java.util.*;

public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers to be taken:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int total = 0;
        for(int i=0;i<n;i++){
            System.out.print("Enter the next value:");
            arr[i] = sc.nextInt();
            total = total + arr[i];
        }
        System.out.println(Arrays.toString(arr));
        int a = total/n;
        System.out.printf("Average = %d",a);
    }
}

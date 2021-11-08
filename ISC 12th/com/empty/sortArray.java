package com.empty;
import java.util.*;

public class sortArray {
    public static void main(String[] args){
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        m = sc.nextInt();
        System.out.println("Enter number of Columns: ");
        n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter the values of the matrix:");
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Array:");
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int temp;
        System.out.println("Sorted Array:");
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n-1;j++){
                if(arr[i][j+1]<arr[i][j]){
                    temp = arr[i][j];
                    arr[i][j]=arr[i][j+1];
                    arr[i][j+1]=temp;
                }
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

package com.empty;
import java.util.*;
public class DigitsSum {
    public static int sumofdigits(int n){
        int a=0;
        while(n>0){
            a = a+n%10;
            n = n/10;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M :");
        int m = sc.nextInt();
        System.out.print("Enter N :");
        int n = sc.nextInt();
        int t = 0;
        if(m>100 && m<10000 && n<100){
            while(n!=t){
                m=m+1;
                t=sumofdigits(m);
            }
            System.out.println("Sum of Digits :"+t);
            System.out.println("Required Number is : "+m);
        }
        else{
            System.out.println("INVALID INPUT");
        }
    }
}

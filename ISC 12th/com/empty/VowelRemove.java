package com.empty;
import java.util.Scanner;
public class VowelRemove {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String a = sc.nextLine();
        String b = remove(a);
        System.out.println("Word without Vowels: "+b);
    }
    public static String remove(String a){
        int len = a.length();
        String x = "";
        for(int i=0;i<len;i++){
            char b = a.charAt(i);
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'){
                continue;
            }
            else{
                x = x + b + " ";
            }
            System.out.println(b);
        }
        return x;
    }
}

package com.empty;

import java.util.*;
class WordRemove {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = "", st1="", st2="", st3="";
        int i,t,n;
        char ch;

        System.out.println("Enter a sentence:");
        st1 = sc.nextLine().toUpperCase();
        System.out.println("Enter the word to be removed:");
        word = sc.next();

        System.out.println("Enter postion number of the word to be removed:");
        n=sc.nextInt();

        int len = st1.length();
        ch = st1.charAt(len-1);

        if((ch=='.')||(ch=='?')||(ch=='!')){
            StringTokenizer st = new StringTokenizer(st1);
            t = st.countTokens();
            for(i=1;i<=t;i++) {
                st2 = st.nextToken().trim();
                if (st2.equals(word) == false || i != n)
                    st3 = st3 + ' ' + st2;
            }
            System.out.println("Sentence after removing the word is: ");
            System.out.println(st3);
        }
        else
            System.out.println("Invalid Input");
    }
}

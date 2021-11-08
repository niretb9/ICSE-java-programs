/*
- This Maths class is used in the Main class for tests.
- In order to run these functions use them in the main class
- The Maths class includes the following functions:
  1-Fibonacci
  2-Swap two digits
  3-Factorial
  4-Power
 */
package com.empty;
class Maths {
    //1- Fibonacci function
    static void fibb(int n) {
        System.out.printf("The Fibonacci Series up to %d terms is: ", n);
        System.out.print(0);
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 0; i < n; i++) {
            System.out.print("," + c);
            c = a + b;
            a = b;
            b = c;
        }
    }
    //2- Swapping function, 2nd param is for operation at use
    static int swap(int a,int b){
        return(a);
    }
    //3- Factorial function
    static int factorial(int n){
        int a = 1;
        for(int i = 1;i<=n;i++){
            a = a*i;
        }
        return(a);
    }
    //4- Power function
    static int power(int a,int b){
        int n=1;
        for(int i = 0;i<b;i++){
            n = n*a;
        }
        return(n);
    }
}

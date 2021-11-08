package com.empty;
import java.util.*;
class triang
{

    // Returns true if 'num' is
    // triangular, else false
    static boolean TriangNum(int num)
    {
        // Base case
        if (num < 0)
            return false;

        // A Triangular number must be
        // sum of first n natural numbers
        int sum = 0;

        for (int n = 1; sum <= num; n++)
        {
            sum = sum + n;
            if (sum == num)
                return true;
        }

        return false;
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.:");
        int n = sc.nextInt();
        if (TriangNum(n))
            System.out.print("The number "
                    + "is a triangular number");
        else
            System.out.print("The number"
                    + " is NOT a triangular number");
    }
}
package Recursion;

import java.util.*;
class Hanoi
{
    void SHIFT(int n, String first, String middle, String last)
    {
        if (n==1)
            System.out.println("Disc moved from " + first + " to " + last);
        else
        {
            SHIFT(n-1, first, last, middle);
            System.out.println("Disc moved from "+ first + " to " + last);
            SHIFT(n-1, middle, first, last);
        }
    }

    public static void main(String args[])
    {
        Hanoi obj = new Hanoi();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n : ");
        int nod = sc.nextInt();
        obj.SHIFT(nod, "A", "B" , "C");
    }
}

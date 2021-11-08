package com.empty;
import java.util.*;
class Achilles_num
{
    public boolean isPerfectPower(int num)
    {
        for(int i = 2; i <= num; i++)
        {
            for(int j = 2; j <= num; j++)
            {
                if(Math.pow(i, j) == num)
                {
                    return true;
                }
                else if(Math.pow(i, j) > num)
                    break;
            }
        }
        return false;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Achilles_num obj = new Achilles_num();

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        boolean status = true;

        if(!obj.isPerfectPower(num))
        {
            int n = num;
            int pf = 2;
            while(n != 1)
            {
                if(n % pf == 0)
                {
                    int s = pf * pf;
                    if(num % s != 0)
                    {
                        status = false;
                        break;
                    }
                    n /= pf;
                }
                else
                    pf++;
            }
        }
        else
            status = false;
        if(status)
            System.out.println(num + " is an Achilles Number.");
        else
            System.out.println(num + " is not an Achilles Number.");
    }
}

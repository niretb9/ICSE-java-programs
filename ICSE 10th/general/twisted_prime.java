import java.util.*;
public class twisted_prime
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
       
        int d;
        int rev = 0;
         int count1 = 0, count2 = 0;
        int a = sc.nextInt();
        for(int i = 1;i<=a;i++)
        {
            if(a%i==0)
            count1++;
        }
        while(a>0)
        {
             d = a % 10;
             rev = rev * 10 + d;
             a = a / 10;
            }

        
                     for(int j =1;j<=rev;j++)
        {
            if(rev%j==0)
            count2++;
        }
        if(count1==2&&count2==2)
        System.out.println("it is a twisted prime ");
        else
        System.out.println("it is not a twisted prime");
        

    }
}
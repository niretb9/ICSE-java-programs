/*
         1
        01
       101
      0101
     10101 
 */
import java.util.*;
public class pattern_10
{
    public static void main()
    {
        for(int i =1;i<=5;i++)
        {
                    
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++)
            {
                if((i+j)%2==0)
                System.out.print("1");
                else
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
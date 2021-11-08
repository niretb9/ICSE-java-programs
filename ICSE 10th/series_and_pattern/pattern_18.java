/*
  *******
  *** ***
  **   **
  *     *
 
         
*/
import java.util.*;
public class pattern_18
{
    public static void main()
    {
        int x = 1;
        for(int i =1;i<=4;i++)
        {
            for(int j =1;j<=(5-i);j++)
            {
                System.out.print("*");
            }
            if(i==1)
            System.out.print("***");
            
            if (i>1)
            {
        for(int k=1;k<=x;k++)
        {
            System.out.print(" ");
        }
        x = x+2;
        
       // System.out.println();
       for(int j =1;j<=5-i;j++)
        {
            System.out.print("*");
        }
    }
        System.out.println();
    
    }
}
}

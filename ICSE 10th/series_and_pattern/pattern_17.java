/*
         *
        ***
       *****
      *******
       *****
        ***
         *
 */
import java.util.*;
public class pattern_17
{
    public static void main()
    {
        for(int i =1;i<=4;i++)
        {
           for(int k =1;k<=(i-1);k++)
           {
               System.out.print("*");
           
           for(int j= 1;j<=(k+2);j++)
           System.out.print(j);
        }
        System.out.println();
    }
}
}
           
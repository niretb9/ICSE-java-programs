/*
          1
         12
        123
       1234
      12345 
 */



import java.util.*;
public class pattern_8
{
    public static void main()
    {
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
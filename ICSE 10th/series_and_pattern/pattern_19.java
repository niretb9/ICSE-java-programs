/*
       *
      * *
     * * *
    * * * *
     * * *
      * *
       *
 */
import java.util.*;
public class pattern_19
{
    public static void main()
    {
        
        for(int i=1;i<=4;i++)
        {
            for(int k = 1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=3;i++)
        {
            for(int k =1;k<=i+1;k++)
            {
                System.out.print(" " );
            }
            for(int j = 1;j<=4-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
            






/*
   1
   01
   010
   0101
   01010
*/   
import java.util.*;
public class pattern_4
{
    public static void main()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if ((i+j) % 2 == 0)
                System.out.print("1");
                else
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
        
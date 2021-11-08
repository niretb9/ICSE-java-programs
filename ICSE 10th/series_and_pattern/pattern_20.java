/*
   1111111
   1111122
   1111333
   1114444
   1155555
   1666666
   7777777
 */
import java.util.*;
public class pattern_20
{
    public static void main()
    {
        for(int i =1;i<=7;i++)
        {
            for(int j =1;j<=(7-i);j++)
            {
                System.out.print("1");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        
    }
}

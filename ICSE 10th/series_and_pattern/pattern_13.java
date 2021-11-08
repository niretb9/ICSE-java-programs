/*
    1
    21
    321
    4321
    54321
 */
import java.util.*;
public class pattern_13
{
    public static void main()
    {
        int a =0;
        for(int i=1;i<=5;i++)
        {
            a = i;
            for(int j =1;j<=i;j++)
            {
                
                System.out.print(a--);
            }
            System.out.println();
        }
    }
}
/*
     5
     46
     357
     2468
     13579
 */import java.util.*;
public class pattern_26
{
    public static void main()
    {
        for(int i =1;i<=5;i++)
        {
            int a = 6 - i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(a);
                a = a + 2;
            }
            System.out.println();
        }
    }
}
/*
  1
  2 3
  4 5 6
  7 8 9 10
  11 12 13 14 15
 */





import java.util.*;
public class pattern_floyyd_triangle
{
    public static void main()
    {
        int a=1;
        for(int i=1;i<=5;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print(a++ + " ");
                
            }
            System.out.println();
        }
    }
}

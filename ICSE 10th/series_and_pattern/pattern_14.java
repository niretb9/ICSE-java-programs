/*
  1
  121
  12321
  1234321
  */
import java.util.*;
public class pattern_14
{
    public static void main()
    {
        int a =0;
        for(int i=1;i<=4;i++)
        {
            a = i-1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);

            
            
            }
            for(int k=1;k <=(i-1);k++)
            {
                System.out.print(a--);
            }
            System.out.println();
        }
    }

}
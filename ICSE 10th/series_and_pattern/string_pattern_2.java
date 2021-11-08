/*
    I
   IN
  IND
 INDI
INDIA
 */
import java.util.*;
public class string_pattern_2
{
    public static void main()
    {
        String s = "INDIA";
        for(int i = 0;i<s.length();i++)
        {
            for(int k = 1;k<=4-i;k++)
            {
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
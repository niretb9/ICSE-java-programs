/*
   I
   NN
   DDD
   IIII
   AAAAA
 */
import java.util.*;
public class string_pattern_3
{
    public static void main()
    {
        String s = "INDIA";
        for(int i = 0;i<s.length();i++)
        {
            for(int j = 0;j<=i;j++)
            {
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}


/*
    I
    IN
    IND
    INDI
    INDIA
 */
import java.util.*;
public class String_pattern
{
    public static void main()
    {
        String s = "INDIA";
        for(int i = 0;i<s.length();i++)
        {
            for(int j = 0;j<=i;j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
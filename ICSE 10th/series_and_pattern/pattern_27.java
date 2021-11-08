


/*
    54321
     4321
      321
       21
        1
 */
import java.util.*;
public class pattern_27
{
    public static void main()
    {
        for(int i =1;i<=5;i++)
        {
            int a = 6 -i;
            for(int k =1;k<=(i-1);k++)
            {
                System.out.print( " " );
            }
            for(int j =1;j<=(6-i);j++)
            {
                System.out.print(a--);
            }
            System.out.println();
        }
    }
}
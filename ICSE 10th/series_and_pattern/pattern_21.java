/*   5
    45
   345
  2345
 12345 
*/
import java.util.*;
public class pattern_21
{
    public static void main()
    {
        for(int i =1;i<=5;i++)
        {
            int a = 6 - i;
            for(int k = 1;k<=(5-i);k++)
            {
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++)
            {
                System.out.print(a++);
            }
            System.out.println();
        }
    }
}
            
        
/*
   1 + (1+2) + (1+2+3) + .......n
 */
import java.util.*;
public class series_8
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.");
        int n = 0;
        n = sc.nextInt();
        int fact = 0;
        int sum =0;
        int a;
        for(int i =1;i<=n;i++)
        {
            a = i;
            fact = 0;
            for(int j =1;j<=a;j++)
            {
                fact = fact + j;
            }
            sum = sum + fact;
        }
        System.out.println(sum);
    }
}

        
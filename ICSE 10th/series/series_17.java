/*
   1/1! + 2/2! + 3/3! + .........n
 */
import java.util.*;
public class series_17
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.");
        int n = sc.nextInt();
        double sum = 0;
        double fact ;
        boolean flag = true;
        for(int i=1;i<=n;i++)
        {
            fact = 1;
            for(int j =1;j<=i;j++)
            {
                fact = fact * j;
            }
            if(flag == true)
            {
                sum = sum + i/fact;
                flag = false;
            }
            else 
            {
                sum = sum - i/fact;
                flag = true;
            }
        }
        System.out.println(sum);
    }
}

             
                 
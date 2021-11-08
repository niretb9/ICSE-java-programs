/*
  x - x^2/2! + x^3/3! + x^4/4!...............n
 */
import java.util.*;
public class series_14
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.");
        int n = sc.nextInt();
        int x = sc.nextInt();
        double sum = 0;
        double fact;
        boolean flag = true;
        for(int i =1;i<=n;i++)
        {
            fact = 1;
            for(int j =1;j<=i;j++)
            {
                fact = fact * j;
            }
            if(flag == true)
            {
                sum = sum + Math.pow(x,i)/fact;
                flag = false;
            }
            else
            {
                sum = sum - Math.pow(x,i)/fact;
            }
        }
        System.out.println(sum);
    }
}
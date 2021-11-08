/*
   x + x^2 + x^3 + x^4 + ......x^n
 */
import java.util.*;
public class series_10
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no");
        int x = sc.nextInt();
        int n = sc.nextInt();
        double sum = 0;
        for(int i =1;i<=n;i++)
        {
            sum = sum + Math.pow(x,i);
        }
        System.out.println(sum);
    }
}
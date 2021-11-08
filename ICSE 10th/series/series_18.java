/*
   1 + 3 + 7 + 15 + 31 + 63 + 127 + .............n
 */
import java.util.*;
public class series_18
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.");
        int n = sc.nextInt();
        double sum =0;
        for(int i =1;i<=n;i++)
        {
            sum = sum + (Math.pow(2,i)-1);
        }
        System.out.println(sum);
    }
}
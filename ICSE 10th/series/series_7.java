/*
  1+2     2+3
  ---  +  --- + ....n
  1*2     2*3
 */
import java.util.*;
public class series_7
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no");
        int n = sc.nextInt();
        double sum =0;
        double a ;
        int b;
        for(int i =1;i<=n;i++)
        {
            a = i + (i+1);
            b = i * (i+1);
            sum = sum + a/b;
        }
        System.out.println(sum);
    }
}

 
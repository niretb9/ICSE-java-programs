/*
 1 + 12 + 123 +1234 +12345 + ..........n
 */
import java.util.*;
public class series_5
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no");
        int n = 0;
        n = sc.nextInt();
        int a =1;
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = sum + a;
            a = a * 10 + (i+1);
        }
        System.out.println(sum);
    }
}
 
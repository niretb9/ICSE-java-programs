/*
 1 + 11 + 111 + 1111 + 11111 + ...........n
 */
import java.util.*;
public class series_4
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
            a = a * 10 + 1;
        }
        System.out.println(sum);
    }
}

/*
 2 + 4 + 6 + 8 + 10 + 12 +................n
 */
import java.util.*;
public class series_2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no");
        int n = 0;
        n = sc.nextInt();
        int sum = 0;
        for(int i =2;i<=n;i+=2)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}


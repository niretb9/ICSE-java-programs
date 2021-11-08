/*
   1 + 4 + 9 + 16 + 25 + ........n
 */
import java.util.*;
public class series_9
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no");
        int n = sc.nextInt();
        int sum = 0;
        for(int i =1;i<=n;i++)
        {
            sum = sum + (i*i);
        }
        System.out.println(sum);
    }
}
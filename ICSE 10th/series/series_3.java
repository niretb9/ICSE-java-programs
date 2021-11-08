/*
   5 + 10 + 15 + 20 + 25..........n
 */
import java.util.*;
public class series_3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no");
        int n = 0;
        n= sc.nextInt();
        int sum =0;
        for(int i =5;i<=n;i+=5)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

/*
  1/4 + 1/8 + 1/12 + 1/16................n
*/
import java.util.*;
public class series_16
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.");
        int n = sc.nextInt();
        double sum = 0;
        for(int i=4,j=1;j<=n;i+=4, j++)
        {
            sum = sum + 1.0/i;
        }
        System.out.println(sum);
    }
}
            
/*
   0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + ..................n 
   fibonacci series
 */
import java.util.*;
public class series_15
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NO.");
        int n = sc.nextInt();
        int t1 = 0;
        int t2 = 1;
        int t3= 0 ;
        int sum = 0;
        sum = t1 + t2;
        for(int i=1;i<=(n-2);i++)
        {
             t3 = t1 + t2;
             sum = sum + t3;
             t1 = t2;
             t2 = t3;
            }
        System.out.println(sum);
    }
}    
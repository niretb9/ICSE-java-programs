import java.util.*;
public class krishnamurthy_range
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int u = sc.nextInt();
        int n;
        int d;
        int fact = 1;
     int sum = 0;
     for(int j =l;j<=u;j++)
     {
     n=j;
    sum =0;
        while(n>0)
    {
       d = n % 10;
       fact =1;
       n = n / 10;
       for(int i=1;i<=d;i++)
       {
           fact = fact * i;
       }
       sum = sum + fact;
    }
    if (sum == j)
    System.out.println(j);
}
}
}

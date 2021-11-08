import java.util.*;
public class armstrong_range
{
    public static void main ()
    {
        Scanner sc = new Scanner(System.in);
        int l ;
        int u,a, sum,d ;
        l = sc.nextInt();
        u = sc.nextInt();
        for(int i = l;i<=u;i++)
        {
            
            a = i;
            sum =0;
        while(a>0)
        {
            d = a % 10;
            sum = sum + d * d * d;
            a = a / 10;
        }
        if (sum  == i)
        System.out.println(i);
    }
}
}
import java.util.*;
public class fibonacci_limits
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any limit");
        int n = sc.nextInt();
        int t1 = 0;
        int t2 = 1;
        int t3 = 0;
        System.out.println(t1);
        System.out.println(t2);
        while(t3<=n)
        {
            t3 = t1 + t2;
            if(t3 <=n)
            System.out.println(t3);
            t1 = t2;
            t2 = t3;
        }
    }
}

        
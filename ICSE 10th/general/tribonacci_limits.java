import java.util.*;
public class tribonacci_limits
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any limit");
        int n = sc.nextInt();
        int t1 = 0;
        int t2 = 1;
        int t3 = 1;
        int t4 = 0;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        while(t3<=n)
        {
            t4 = t1 + t2 + t3;
            if(t4 <=n)
            System.out.println(t4);
            t1 = t2;
            t2 = t3;
            t3 = t4;
        }
    }
}

        
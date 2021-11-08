import java.util.*;
public class prime_fibonacci
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any limit");
        int n = sc.nextInt();
        int t1 = 0;
        int t2 = 1;
        int t3 = 0;
        int count;
        System.out.println(t1);
        System.out.println(t2);
        while(t3<=n)
        {
            count = 0;
            t3 = t1 + t2;
            if(t3 <=n)
            {
                for (int i = 1; i<=t3; i++)
                {
                    if (t3%i ==0)
                    count++;
                }
                if(count==2)
            System.out.println(t3);
        }
            t1 = t2;
            t2 = t3;
        }
    }
}

        
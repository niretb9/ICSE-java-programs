import java.util.*;
public class tribonacci_terms
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.of terms");
        int t1 = 0;
        int t2 = 1;
        int t3 = 1;
        int t4 = 0;
        int n = sc.nextInt();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        for(int i=1;i<=n-3;i++)
        {
            t4 = t1 + t2 + t3;
            System.out.println(t4);
            t1 = t2;
            t2 = t3;
            t3 = t4;
        }
    }
}
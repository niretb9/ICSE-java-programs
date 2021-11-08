import java.util.*;
public class amicable_no
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for(int i =1;i<=a;i++)
        {
            if(a % i==0)
            {
                sum1 = sum1 + i;
            }
            for(int j =1;j<a;j++)
            {
                if(b%j==0)
                sum2 = sum2 + j;
            }
            if(sum1==sum2)
            System.out.println("it is an amicable no");
            else
            System.out.println("it is not an amicable no");
        }
    }
}
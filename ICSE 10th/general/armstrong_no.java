import java.util.*;
public class armstrong_no
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int a = 0;

        int d = 0;
        int sum = 0;
        a = sc.nextInt();
                int b = a;
        while(a>0)
        {
            d = a % 10;
            sum = sum + d * d * d;
            a = a / 10;
        }
        if(sum==b)
        System.out.println("it is an amstrong no.");
        else
        System.out.println("it is not amstrong no.");
    }
}
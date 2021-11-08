//spy no is  132 and 1412
import java.util.*;
public class spy_no
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        int product = 1;
        int d;
        System.out.println("enter any number");
        n = sc.nextInt();
        int n1 = n;
        while(n>0)
        {
            d = n % 10;
            sum = sum + d;
            n = n/ 10;
        }
        while(n1>0)
        {
            d = n1 % 10;
            product = product * d;
            n1 = n1 / 10;
        }
        if(sum==product)
        System.out.println("it is a spy number");
        else
        System.out.println("it is not a spy number");
    }
}           
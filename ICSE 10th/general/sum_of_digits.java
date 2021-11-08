import java.util.*;
public class sum_of_digits
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int d;
        int sum = 0;
        System.out.println("enter any number");
        n = sc.nextInt();
        while(n>0)
        {
            d = n % 10;
            sum = sum + d;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
        
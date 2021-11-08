import java.util.*;
public class product_of_even_succesors
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no");
        int n = sc.nextInt();
        int d;
        int p = 1;
        while(n>0)
        {
            d = n % 10;
            if(d%2==0)
            p = p * (d+1);
            n = n/10;
        }
        System.out.println(p);
    }
}
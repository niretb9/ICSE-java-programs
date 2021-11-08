import java.util.*;
public class binary_to_decimal
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n ;
        int d ;
        int i = 0;
        double sum = 0;
        System.out.println("enter any no");
        n = sc.nextInt();
        while(n>0)
        {
            d = n % 10;
            sum = sum +  Math.pow(2,i) * d;
            n = n / 10;
            i++;
        }
        System.out.println(sum);
    }
}

            
        
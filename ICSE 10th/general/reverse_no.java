import java.util.*;
public class reverse_no
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int d ;
        int n;
        System.out.println("enter any number");
        n = sc.nextInt();
        int rev = 0;
        while(n>0)
        {
            d = n % 10;
            rev = rev * 10 +d;
            n = n / 10;
        }
        System.out.println("the reverse of the number =" +rev);
    }
}
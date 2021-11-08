import java.util.*;
public class decimal_to_binary
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a ;
        int d;
        String s = " ";
        System.out.println("enter any no.");
        a = sc.nextInt();
        while(a>0)
        {
            d = a % 2;
            s = d + s;
            a = a / 2;
        }
        System.out.println(s);
    }
}
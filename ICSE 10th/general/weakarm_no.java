import java.util.*;
public class weakarm_no
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter any no.");
        a = sc.nextInt();
        int d;
        int i = 1;
        double sum  = 0;
        int temp = a;
        {
            int rev = 0;
            while(a>0)
            {
                d = a % 10;
                rev = rev * 10 + d;
                a = a / 10;
            }
            while(rev>0)
            {
                d = rev % 10;
                sum = sum + Math.pow(d , i);
                rev = rev / 10;
            }
            if(temp == sum)
            System.out.println("it is an weakarm no.");
            else 
            System.out.println("it is not a weakarm no.");
        }
    }
}
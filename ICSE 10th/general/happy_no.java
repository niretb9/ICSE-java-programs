import java.util.*;
public class happy_no
{
    public static int sum(int n)
    {
        int s = 0;
        int d;
        while (n>0)
        {
            d = n%10;
            s = s+d;
            n= n/10;
        }
        return s;
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.");
        int n = sc.nextInt();
        while (n>9)
        {
            n = sum(n);
        }
        if (n ==1)
        System.out.println("happy no");
        else
        System.out.println("sad no.");
    }
}

        

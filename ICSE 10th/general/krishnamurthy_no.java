import java.util.*;
public class krishnamurthy_no
{
    public static void main()
    {
    Scanner sc = new Scanner(System.in);
    int a ;
    int n;
    int d;
    int fact = 1;
    int sum = 0;
    System.out.println("enter any number");
    n = sc.nextInt();
    a = n;
    while(n>0)
    {
       d = n % 10;
       fact =1;
       n = n / 10;
       for(int i=1;i<=d;i++)
       {
           fact = fact * i;
       }
       sum = sum + fact;
    }
    if (sum == a)
    System.out.println("it is a krishnamurthy no.");
    else
    System.out.println("not a krishnamurthy no");
}
}


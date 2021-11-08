import java.util.*;
public class palindrome
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int d ;
        int n;
        int n1;
        System.out.println("enter any number");
        n = sc.nextInt();
        n1 = n;
        int rev = 0;
        while(n>0)
        {
            d = n % 10;
            rev = rev * 10 +d;
            n = n / 10;
        }
        if(n1 == rev)
        System.out.println("the number is a palindrome:");
        else
                System.out.println("the number is not a palindrome:");
    }
}
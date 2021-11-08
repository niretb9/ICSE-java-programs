import java.util.*;
public class harshad_no
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.");
        int a = sc.nextInt();
        int d;
        int temp = a;
        int sum = 0;
        while(temp>0)
        {
            d = temp % 10;
            sum = sum + d;
            temp = temp / 10;
        }
        if(a%sum==0)
        System.out.println("it is an harshad no.");
        else 
        System.out.println("it is not an harshad no.");
    }
}
import java.util.*;
public class leapyear
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a;
       System.out.println("enter any number");
                a = sc.nextInt();
        if (a%100 == 0)
        {
        if(a%400==0)
        System.out.println("it is a leap century year");
        else 
        System.out.println("not a leap year");
    }
    else
    {
        if (a%4==0)
        System.out.println("it is a leap year");
        else 
        System.out.println("not a leap year");
    }
}
}
 
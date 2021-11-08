
import java.util.*;
public class function1
{
    public static int add(int a, int b)
    {
        int c =  a+b;
        return c ; 
    }
    public static void display()
    {
        System.out.println("testing");
    } 
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        display();
        int a , b;
        System.out.println("enter a, b");
        a = sc.nextInt();
        b = sc.nextInt();
        int m = add(a,b);
        System.out.println(m);
    }
}
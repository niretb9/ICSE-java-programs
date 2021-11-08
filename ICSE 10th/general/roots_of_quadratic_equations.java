import java.util.*;
public class roots_of_quadratic_equations
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a b c");
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c=sc.nextInt();
        if(a == 0 || (b*b < 4*a*c))
        System.out.println("imaginary roots");
        else if (b*b == 4*a*c)
        System.out.println("equal roots " + (-b/(2*a)));
        else
        {
            double root = (-b + Math.sqrt(b*b - 4*a*c)/(2*a));
            System.out.println("first root " + root);
            root = (-b - Math.sqrt(b*b - 4*a*c)/(2*a));
            System.out.println("first root " + root);
        }
    }
}
        
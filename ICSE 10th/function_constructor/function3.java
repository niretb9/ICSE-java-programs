import java.util.*;
public class function3
{
    public static void vol(double a )
    {
        System.out.println(a * a * a);
    }
    public static void vol(double b , double c)
    {
        System.out.println(3.14 * (b*b) * c);
    }
    public static void vol(double d , double e , double f)
    {
        System.out.println(d * e * f);
    }
    public static void main()
    {
        double a, b , c;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.volume of cube");
        System.out.println("2.volume of cylinder");
        System.out.println("3.volume of rectangular prism");
        System.out.println("enter any option");
        int h = sc.nextInt();
        switch(h)
        {
            case 1:
            System.out.println("enter side of cube");
            a = sc.nextDouble();
            vol(a);
            break;
             
            case 2:
            System.out.println("enter radius and height");
            a = sc.nextDouble();
            b = sc.nextDouble();
            vol(a,b);
            break;
            
            case 3:
            System.out.println("enter length , width and height");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            vol(a,b,c);
            break;
        }
    }
}
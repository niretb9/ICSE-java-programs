import java.util.*;
public class member
{
    Scanner sc = new Scanner(System.in);
    int num1;
    float num2;
    double num3;
    void getdata()
    {
        System.out.println("enter num1");
        num1 =sc.nextInt();
        System.out.println("enter num2");
        num2 = sc.nextFloat();
        System.out.println("enter any double value");
        double a = sc.nextDouble();
        num3 = calc(a);     
    }
    double calc(double a)
    {
        return a*a;
    }
    int sum (int a , int b)
    {
        return a+b;
    }
    void display()
    {
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2 );
        System.out.println("num3 " + num3);
        System.out.println("sum = " + sum(5,7));
    }
    public static void main()
    {
        member obj = new member();
        obj.getdata();
        obj.display();
    }
}
        
        

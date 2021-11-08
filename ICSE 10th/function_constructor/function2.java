import java.util.*;
public class function2
{
    public static void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public static void add(double a, double b)
    {
        System.out.println(a+b);
    }
    public static void add (int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
    public static void main()
{
    Scanner sc = new Scanner (System.in);
     int x, y, z;
     double p,q;
      System.out.println("enter p q");
      p = sc.nextDouble();
      q = sc.nextDouble();
      add(p,q);
      System.out.println("enter x y z");
      x = sc.nextInt();
      y = sc.nextInt();
      z= sc.nextInt();
      add (x,y,z);
    }
}

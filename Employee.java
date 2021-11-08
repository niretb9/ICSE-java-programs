import java.util.*;
public class Employee
{
    int code;
    String name;
    double basic , hr , da, pf;
    Employee()
    {
        code = 0 ;
        basic = 0;
        hr = 0;
        da = 0;
        pf = 0;
    }
    
    Employee(int c,String n,double b)
    {
        code =c;
        name = n;
        basic = b;
        hr = 0.1 * basic;
        da = 0.55 * basic;
        pf = 1000;
    }
    public void compute()
    {
        double netsal = basic + hr + da - pf;
        System.out.println("your net salary is " +netsal);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
         int c = sc.nextInt();
         String n = sc.next();
         double b = sc.nextDouble();
        Employee obj = new Employee(c,n , b);
        obj.compute();
        
    }
}



        
         
        
    
import java.util.*;
public class work
{
    int wno;
    double hwk;
    double wrate;
    double twage;
    void calc()
    {
        twage = wrate * hwk;
            }
    void init()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your details wno, hwk, wrate");
        wno = sc.nextInt();
        hwk = sc.nextDouble();
        wrate = sc.nextDouble();
       
    }
    void display()
    {
        System.out.println("your worker id " + wno );
        
        System.out.println("no. of hours worked" +hwk);
        
        System.out.println("work rate =" +wrate );
        
        System.out.println("your total wage is" +twage);
    }
    public static void main()
    {
        work obj = new work();

        obj.init();
        obj.calc();
        obj.display();
    }
}
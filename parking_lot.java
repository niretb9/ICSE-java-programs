import java.util.*;
public class parking_lot
{
    int vno;
    int hours;
    double bill;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the vehicle no. and no. of hours");
        vno = sc.nextInt();
        hours = sc.nextInt();
    }
    void calculate()
    {
        if(hours == 1)
        bill = 3;
        else if(hours>1)
        bill = 3 + 1.5*(hours - 1);
    }
    void display()
    {
        System.out.println( "vehicle no = " + vno+ "  hours = "  + hours+ "  amount =  " + bill);
    }
    public static void main()
    {
        parking_lot obj = new parking_lot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
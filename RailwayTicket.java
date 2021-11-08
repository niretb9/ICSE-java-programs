import java.util.*;
public class RailwayTicket
{
    String name;
    String coach;
    long mobno;
    int amt,totalamt;
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the details");
        name = sc.nextLine();
        coach = sc.nextLine();
        mobno = sc.nextLong();
        amt = sc.nextInt();
    }
    void update()
    {
        if(coach.equalsIgnoreCase("First_AC"))
        totalamt = amt + 700;
        else if(coach.equalsIgnoreCase("Second_AC"))
        totalamt = amt + 500;
        else if(coach.equalsIgnoreCase("Third_AC"))
        totalamt= amt + 250;
        else if(coach.equalsIgnoreCase("sleeper"))
        totalamt = amt;
    }
    void display()
    {
        System.out.println("enter your name =" +name);
        System.out.println("your coach = " +coach);
        System.out.println("enter your mobile no.= " +mobno);
        System.out.println("your total amount = " +totalamt);
    }
    public static void main()
    {
        RailwayTicket obj = new RailwayTicket();
        obj.accept();
        obj.update();
        obj.display();
    }
}
        
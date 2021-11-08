import java.util.*;
public class distance
{
    
    int ft , in;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter feet and inches");
        ft=sc.nextInt();
         in=sc.nextInt();
    }
    void display()
    {
        System.out.print("feet = " +ft);
        System.out.print("inches =" +in);
    }
   public distance   add(distance t)
    {    
        distance obj = new distance();
        obj.ft = ft + t.ft;
        obj.in = in + t.in;
        if( obj.in > 12)
        {
            obj.in = obj.in - 12;
            obj.ft = obj.ft + 1;
        }
        return obj;
    }
    public static void main()
    {
        distance obj1 = new distance();
        distance obj2 = new distance();
        distance obj3 = new distance();
        obj1.getdata();
        obj2.getdata();
        obj3 = obj1.add(obj2);
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
        
        
        
        
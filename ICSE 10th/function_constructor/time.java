
import java.util.*;
public class time
{
    int h, m, s;
    time()
    {
        h = 0;
        m = 0;
        s = 0;
    }
    public void getdata()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter hr , minute and second");
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
    }
    public void display()
    {
        System.out.println(h + ":" + m + ":" + s);
    }
    public time add(time t)
    {
        time obj = new time();
        obj.h = h + t.h;
        obj.m = m + t.m;
        obj.s = s + t.s;
        if (obj.s >60)
        {
            obj.s = obj.s -60;
            obj.m = obj.m +1;
        }
                if (obj.m >60)
        {
            obj.m = obj.m -60;
            obj.h = obj.h +1;
        }
        return obj;
    }
    public static void main()
    {
        time obj1 = new time();
        time obj2 = new time();
        time obj3 = new time();
        obj1.getdata();
        obj1.display();
        obj2.getdata();
        obj2.display();
        obj3 = obj1.add(obj2);
        obj3.display();
    }
}
        
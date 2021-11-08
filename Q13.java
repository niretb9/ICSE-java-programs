import java.util.*;
public class Q13
{
    int Rollno;
    int height;
    int weight;
    public void get(int r , int h , int w)
    {
        Rollno = r;
        height = h;
        weight = w;
    }
    public void set(int hh)
    
    {
        height = height + hh;
    }
    public void print()
    {
       System.out.println( Rollno +" " +height+ " " +weight);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Q13 obj = new Q13();
        System.out.println("enter roll no , height , weight");
        int r = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        obj.get(r,h,w);
        System.out.println("enter height increament");
        h = sc.nextInt();
        obj.set(h);
        obj.print();
    }
}

        
        
        
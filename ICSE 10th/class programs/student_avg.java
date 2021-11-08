import java.util.*;
public class student_avg
{
    Scanner sc = new Scanner(System.in);
    String name;
    int roll;
    int sci;
    int math;
    int comp;
    double avg;
    void getdata()
    {
        System.out.println("enter name");
        name = sc.next();
        System.out.println("enter roll no.");
        roll = sc.nextInt();
        System.out.println("enter sci");
        sci = sc.nextInt();
        System.out.println("enter math");
        math = sc.nextInt();
        System.out.println("enter comp");
        comp = sc.nextInt();
        avg = (sci + math + comp) / 3.0 ;
    }
    void display()
    {
        System.out.println("name" +name);
        System.out.println("roll no." +roll);
        System.out.println("sci marks" +sci);
        System.out.println("math marks" +math);
        System.out.println("comp marks" +comp);
        System.out.println("average percentage" +avg);
    }
    public static void main()
    {
        student_avg obj = new student_avg();
        obj.getdata();
        obj.display();
    }
}
        
        
    
        
        
        
     
       
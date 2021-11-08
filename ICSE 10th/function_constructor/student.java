import java.util.*;
public class student
{
    int roll;
    String name;
    int marks;
    student() // default constructor
    {
        roll = 100;
        marks = 100;
        name = "abcd";
    }
    student(int roll, int marks, String name)  // parameterized constructor  `1
    {
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }
    student (int r, int m)   // parametised constructor 2
    {
        roll = r;
        marks = m;
        name = "xxx";
    }
    
    public void getdata()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter roll, name, marks");
        roll = sc.nextInt();
        name = sc.next();
        marks = sc.nextInt();
    }
    public void display()
    {
        System.out.println(roll+ " " + name +" "+ marks);
    }
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int r, m;
        String n;
        student obj = new student();  // using default constructor
        obj.getdata();
        obj.display();
        System.out.println("enter roll, marks, name");
        r = sc.nextInt();
        m = sc.nextInt();
        n= sc.next();
        student obj1 = new student(r, m, n);  //parameterized constructor 1
        obj1.display();
        student obj2 = new student (r, m) ;   // parameterirzed construcotor 2
        obj2.display();
    }
}
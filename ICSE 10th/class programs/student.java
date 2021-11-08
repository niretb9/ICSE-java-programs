import java.util.*;

public class student
{
    Scanner sc = new Scanner(System.in);
    int roll;
    String name;
    int marks;
    void getdata()
    {
        System.out.println("enter roll");
        roll = sc.nextInt();
        System.out.println("enter name");
        name = sc.next();
        System.out.println("enter marks");
        marks = sc.nextInt();
    }
    void display()
    {
        System.out.println("Roll no " + roll);
        System.out.println("Name " + name);
        System.out.println("Marks " + marks);
    }
    public static void main()
    {
        student obj = new student();
        obj.getdata();
        obj.display();
    }
}

        
import java.util.*;
public class factorials
{
    public static void main()
    { 
        Scanner sc = new Scanner(System.in);
        int a;
        int fact = 1;
        System.out.println("enter any number");
        a = sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
        
        
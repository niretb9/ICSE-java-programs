import java.util.*;
public class fibonacci_fill
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any array");
        int n = sc.nextInt();
        int a [] = new int[n];
        int t1 = 0;
        int t2 = 1;
        int t3 = 0; 
        a[0] = t1;
        a[1] = t2;
        a[0] = t3;
        for(int i = 2;i<n;i++)
        {
            t3 = t1 + t2;
            a[i] = t3;
            t1 = t2;
            t2 = t3;
            
        }
        for(int i =0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
        
        
        
        

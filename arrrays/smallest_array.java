import java.util.*;
public class smallest_array
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int min;
        for(int i = 0;i<n;i++)
        {
            System.out.println("enter the elements");
            a[i] = sc.nextInt();
        }
        min = a[0];
        for(int i = 0;i<n;i++)
        {
            if(a[i]<min)
            min = a[i];
        }
        System.out.println("the smallest no. :- " +min);
    }
}
            
        
        
    
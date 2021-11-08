import java.util.*;
public class prime_arrays
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any array");
        int n = sc.nextInt();
        int a [] = new int[n];
         int count = 0;
        int p = 2;
        int i = 0;
        while(i<n)
        {
            count = 0;
            for(int j = 1;j<=p;j++)
            {
                if(p%j==0)
               
                count++;
                
            }
            if (count == 2)
            {
                a[i] = p;
                i++;
            }
            
            p++;
            
            
        }
        for ( i = 0; i<n; i++)
        System.out.println(a[i]);
    }
}
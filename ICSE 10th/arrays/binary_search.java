import java.util.*;
public class binary_search
{
    public static void mmain()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for(int i = 0;i<n;i++)
        {
            System.out.println("enter array elements");
            a[i] = sc.nextInt();
           
        }
        System.out.println("no. to search");
        int m;
        int l= 0 ;
        int u= n-1 ;
        int pos = -1;
        int num = sc.nextInt();
        while(l<=u)
        {
            m = (l+u)/2;
            if(num>a[m])
            {
                l = m +1;
            }
            else if(num<a[m])
            {
                u = m -1;
            }
            else
            {
                pos = m;
                break;
            }
        }
        if(pos==-1)
        System.out.println("no. not found!");
        else
        System.out.println("no. is found in " +pos);
    }
}
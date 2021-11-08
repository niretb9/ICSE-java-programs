import java.util.*;
public class deletion_of_array_element
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int pos = -1;
        for(int i = 0;i<n;i++)
        {
            System.out.println("enter the elements of the arrays");
            a[i] = sc.nextInt();
        }
            
        System.out.println("enter number to delete");
        int num = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            if(a[i]==num)
            {
                pos = i;
                n = n -1;
                for(int k = i;k<n;k++)
                {
                    a[k] = a[k+1];
                }
                i--;
            }
        }
        for(int i =0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
            
                
                
                
import java.util.*;
public class bubble_sort
{
    public  static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int temp;
        for(int i = 0;i<n;i++)
        {
            System.out.println("enter the elements ");
            a[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++)
        {
            for(int j= 0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
       
        }
        for(int i = 0;i<n;i++)
        {
            System.out.println(a[i]);
            }
    }
} 
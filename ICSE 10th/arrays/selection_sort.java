import java.util.*;
public class selection_sort
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int temp;
        int small;
        int pos;
        for(int i = 0;i<n;i++)
        {
            System.out.println("enter the elements ");
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++)
        {
            small = a[i];
            pos = i;
            for(int j = i+1;j<n;j++)
            {
                if(a[j]<small)
                {
                    small = a[j];
                    pos = j;
                }
            }
            temp = a[i];
            a[i] = a[pos];
            a[pos] = temp;
        }
        for(int i = 0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
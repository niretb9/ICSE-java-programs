import java.util.*;
public class concat
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array 1");
        int n1= sc.nextInt();
        int a[] = new int[n1];
        for(int i = 0;i<n1;i++)
        {
            System.out.println("enter the elements of array 1");
            a[i] = sc.nextInt();
        }
        System.out.println("enter size of array2");
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        for(int i = 0;i<n2;i++)
        {
            System.out.println("enter the elements of array 2");
            b[i] = sc.nextInt();
        }
        int c[] = new int[n1+n2];
        int x = 0;
        for(int i = 0;i<n1;i++)
        {
            c[x] = a[i];
            x++;
        }
        for(int i = 0;i<n2;i++)
        {
            c[x] = b[i];
            x++;
        }
        for(int i = 0;i<n1+n2;i++)
        {
            System.out.println(c[i]);
        }
    }
}
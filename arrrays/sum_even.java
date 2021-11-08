import java.util.*;
public class sum_even
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            System.out.println("enter the elements");
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<n ;i++)
        {
            if(a[i]%2==0)
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}

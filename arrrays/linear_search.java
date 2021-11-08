import java.util.*;
public class linear_search
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int pos = -1;
        for(int i =0;i<n;i++)
        {
            System.out.println("enter elements");
            a[i] = sc.nextInt();
        }
        System.out.println("no. to search ");
        int num = sc.nextInt();
        for(int i =0;i<n;i++)
        {
            if(a[i]==num)
            {
                pos = i;
                break;
            }
        }

        if(pos==-1)
        System.out.println("number not found!");
        else
        System.out.println("number is found in : " +pos);
    }
}
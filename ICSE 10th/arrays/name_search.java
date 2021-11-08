import java.util.*;
public class name_search
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        String s[] = new String[n];
        int pos = -1;
        
        for(int i =0;i<n;i++)
        {
            System.out.println("enter the roll");
            a[i] = sc.nextInt();
            System.out.println("enter the name");
            s[i] = sc.next();
        }
        int roll = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
             if(a[i]==roll)
             {
                 pos = i;
                 break;
                }
            }
        if(pos==-1)
        System.out.println("error found");
        else
        System.out.println("your name is " + s[pos]);
    }
}
        
            
import java.util.*;
public class new_no
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int a = sc.nextInt();
        int d;
        int rev1 = 0;
        int rev2 = 0;
        while(a>0)
        {
            d = a%10;
            rev1 = rev1 * 10 + d;
            a = a/ 10;
        }
        while(rev1>0)
        {
            d = rev1 % 10;
            if(d!=0)
            rev2 = rev2 * 10 + d;
            rev1 = rev1 / 10;
        }
            System.out.println(rev2);

        
    }
}
        
        
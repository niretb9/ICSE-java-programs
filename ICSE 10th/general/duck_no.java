import java.util.*;
public class duck_no
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no");
        int a = sc.nextInt();
        int d ;
        boolean flag = true;
        while(a>0)
        {
            d = a % 10;
            if(d==0)
            flag = false;
            a = a / 10;
        }
        if(flag)
        System.out.println("it is not a duck no.");
        else
        System.out.println("it is a duck no.");
    }
}
    

    
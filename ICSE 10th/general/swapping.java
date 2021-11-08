import java.util.*;
public class swapping
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.");
        int  a = sc.nextInt();
        int b = a/100;
        int c = a%100;
        int d = (c*100)+b;
        System.out.println(d);
    }
}

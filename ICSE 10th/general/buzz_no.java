import java.util.*;
public class buzz_no
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%7==0||n%10==7)
        System.out.println("it is a buzz no");
        else 
        System.out.println("it is not a buzz no");
    }
}
        
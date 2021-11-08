/*
   1 + 3 + 5 + 7 + 9..........n
 */
import java.util.*;
public class series_1
{
    public static void main()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number");
    int n = 0;
    n= sc.nextInt();
    int sum =0;
    for(int i =1;i<=n;i+=2)
    {
        sum = sum + i;
    }
    System.out.println(sum);
}
}


     
import java.util.*;
public class prime
{
    public static void main()
    {
    Scanner sc = new Scanner(System.in);
    int a;
    int count = 0;
    System.out.println("enter any no");
    a = sc.nextInt();
    for(int i =1;i<=a;i++)
    {
        if(a%i==0)
        count++;
    }
    if(count==2)
    System.out.println("it is a prime number");
    else
    System.out.println("it is not a prime number");
}
}
    

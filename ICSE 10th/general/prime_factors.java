import java.util.*;
public class prime_factors
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.println("enter any number");
        a = sc.nextInt();
        for(int i = 1;i<=a;i++)
        {
            if(a%i==0)
            {
                int count = 0;
                for(int j =1;j<=i;j++)
                {
                if(i%j==0) 
                count++;
            }
            if(count==2)
            System.out.println(i);
        }
    }
}
}
            
            
            
                           
        
         
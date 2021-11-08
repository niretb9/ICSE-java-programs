import java.util.*;
public class prime_range
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int u;
        int l;
        System.out.println("enter any number");
        l = sc.nextInt();
        u = sc.nextInt();
        int count;
        for(int i=l;i<=u;i++)
        {
         count = 0;
         for(int j= 1;j<=i;j++)
         {
         if (i%j ==0)
         count++;
         }
         if(count==2)
         System.out.println(i);
    }
}
}
        
        
                
            
        


/*
   1!/1!+2!   +   2!/2!+3!   +   ............n; 
 */
import java.util.*;
public class series_11
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no");
        int n = sc.nextInt();
        double sum = 0;
        double fact1, fact2;
        for(int i=1;i<=n;i++)
        {
             fact1 =1;
            fact2 =1;
            for(int j =1;j<=i;j++)
            {
            
                fact1 = fact1 * j;
            }
                for(int j =1;j<=(i+1);j++)
                {
                    fact2 = fact2 * j;  
                }

    
                    sum = sum + fact1/(fact1+fact2);
            
                }   
        
        System.out.println(sum);
}


}
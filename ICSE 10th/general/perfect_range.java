import java.util.*;
public class perfect_range
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any range");
        int l = sc.nextInt();
        int u = sc.nextInt();
        for(int i=l;i<=u;i++)
        {
            int sum = 0;
            for(int j =1;j<=i;j++)
            {
                if (i%j ==0)
                sum = sum + j;
            }
        
        System.out.println(sum);
    }
}
}

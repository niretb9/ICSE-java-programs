import java.util.*;
public class pattern_16
{
    public static void main()
    {
        int x = 7;
        for(int i =1;i<=4;i++)
        {
            for(int k =1;k<=(i-1);k++)
            {
            for(int j=1;j<=x;j++)
            {
                x = x - 2;
                System.out.print("*");
            }
            System.out.println();
        }
        int h =7;
        for(int n=1;i<=3;i++)
        {
            for(int k =1;k<=(n-1);k++)
            {
            for(int j =1;j<=7;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
}
}

            
            
            
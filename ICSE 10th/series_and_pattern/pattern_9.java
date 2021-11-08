/*
         1
        22
       333
      4444
     55555 
 */import java.util.*;
public class pattern_9
{
    public static void main()
    {
        for(int i =1;i<=5;i++)
        {
                    
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
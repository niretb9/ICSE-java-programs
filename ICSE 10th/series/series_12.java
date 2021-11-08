/*
   1 - 3 + 5 - 7 + 9 ...........n 
 */
import java.util.*;
public class series_12
{
    public static void main()
    {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter any numbers");
          int n = sc.nextInt();
          double sum = 0;
          boolean flag = true;
          for(int i =1;i<=n;i+=2)
          {
              if(flag ==true)
              {
                  sum = sum + i;
                  flag = false;
              }
              else
              {
                  sum = sum - i;
                  flag = true;
              }
          }
          System.out.println(sum);
        }
    }   
import java.util.*;
public class pronic_no
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for(int i = 1;i<=n;i++)
        {
            if(i * (i + 1)==n)
            {
                flag = true;
                break;
        }
    }
            if(flag)
            System.out.println("it is an pronic no");
            else
            System.out.println("it is not an pronic no");
        }
    }
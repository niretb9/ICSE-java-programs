import java.util.*;
public class automorphic_no
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        int s = a * a;
        boolean flag = true;
        while(a>0)
        {
            if(a%10!=s%10)
            {
                flag = false;
                break;
            }
            a = a /10;
            s = s / 10;
            if(flag)
            System.out.println("it is an automorphic no");
            else
            System.out.println("it is not an automorphic no");
            }
        }
        }
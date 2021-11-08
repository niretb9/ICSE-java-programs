import java.util.*;
public class hcf_lcm
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int p;
        int HCF = 0;
        int LCM;
        System.out.println("enter any number");
        n = sc.nextInt();
        p = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            if(n%i==0 && p%i == 0)
            HCF = i;
        }
        LCM = (n*p)/HCF;
        System.out.println( "hcf = " + HCF );
        System.out.println("lcm = " + LCM);
    }
}

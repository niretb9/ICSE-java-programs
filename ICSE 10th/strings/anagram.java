import java.util.*;
public class anagram
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        String w1 = sc.next();
        String w2 = sc.next();
        int count1 , count2 ;
        boolean flag = true;
        for(char x = 'a';x<='z';x++)
        {   count1 =0;
            count2 =0;
            for(int i =0;i<w1.length();i++)
            {
                if(x==w1.charAt(i))
                count1++;
            }
            for(int j =0;j<w2.length();j++)
            {
                if(x==w2.charAt(j))
                count2++;
            }
            if (count1!= count2)
            {
                flag = false;
                break;
            }
        }
        if(flag)
        System.out.println("anagram");
        else
        System.out.println("not");
    }
}
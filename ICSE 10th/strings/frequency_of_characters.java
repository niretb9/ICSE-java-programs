import java.util.*;
public class frequency_of_characters
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.");
        String s = sc.nextLine();
        int count;
        for(char x = 'a';x<='z';x++)
        {   count = 0;
            for(int i = 0;i<s.length();i++)
            {
                if(x==s.charAt(i))
                count++;
            }
            if(count!=0)
            System.out.println(x + " " + count);
        }
    }
}
                
import java.util.*;
public class palindrome_string
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String s = sc.nextLine() ;
        s = s + " ";
        String rev = "";
        int count = 0;
        String word = "";
        
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                word = word + s.charAt(i);
            }
            else
            {
                for(int j = word.length()-1;j>=0;j--)
                {
                    rev = rev + word.charAt(j);
                }
                if(word.equals(rev))
                {
                    count++;
                }
                word = "";
                rev =  "";
            }
        }
        System.out.println(count);
    }
}
                
                
                
                
                
                
                
                
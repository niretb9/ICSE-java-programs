import java.util.*;
public class longest_word
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any word");
        String s = sc.nextLine();
        String lw = "";
        s = s + " ";
        String word = "";
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            word = word + s.charAt(i);
            else
            {
                if(word.length()>lw.length())
                lw = word;
                word = "";
            }
        }
            System.out.println(lw);
        }
    
}
                
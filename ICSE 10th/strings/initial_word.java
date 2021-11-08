import java.util.*;
public class initial_word
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String s = sc.nextLine();
        String word = "";
        for(int i =0;i< s.length();i++)
        {
            if(s.charAt(i)!=' ')
            word = word + s.charAt(i);
            
            else
            {
                System.out.print(word.charAt(0) + ".");
                word = "";
                
            }
        }
        System.out.print(word);
    }
}
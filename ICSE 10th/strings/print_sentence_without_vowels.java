import java.util.*;
public class print_sentence_without_vowels
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String s = sc.nextLine();
        for(int i = 0;i<s.length();i++)
        {
           if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u')
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}
        
        


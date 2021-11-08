import java.util.*;
public class count_no_of_double_letters_words
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String s = sc.nextLine();
        s = s+ " ";
        String word = "";
        int count =0;
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            word = word + s.charAt(i);
            else
            {   
                for(int j = 0;j<word.length()-1;j++)
                {
                    if(word.charAt(j)==word.charAt(j+1))
                    {
                        count++;
                    }
                }
                word = "";
            }
        }
        System.out.println(count);
    }
}

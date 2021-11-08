import java.util.*;
public class reverse_word
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String s = sc.nextLine();
        s = " " + s;
        String word = "";
        for(int i = s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            word = word +  s.charAt(i);
            else
            {
                for(int j = word.length() - 1;j>=0;j--)
                {
                    System.out.print(word.charAt(j));
                }
                System.out.print(" ");
                word = "";
            }
        }
    }
}
            
        
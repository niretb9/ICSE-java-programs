import java.util.*;
public class exchange_first_and_last
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String s = sc.nextLine();
        s = s + " ";
        String word = "";
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                word = word + s.charAt(i);
            }
            else
            {
                System.out.print(word.charAt(word.length()-1));
                for(int j = 1;j<word.length()-1;j++)
                {
                    System.out.print(word.charAt(j));
                }
                System.out.print(word.charAt(0) + " ");
                word = "";
            }
        }
    }
}
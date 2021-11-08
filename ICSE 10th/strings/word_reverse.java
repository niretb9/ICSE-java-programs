import java.util.*;
public class word_reverse
{    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any sentence");
        String s = sc.nextLine();
        s = s + " ";
        String word = "";
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            word = word + s.charAt(i);
            else
            {
              for (int j = word.length()-1; j>=0; j--)
              {
                  System.out.print(word.charAt(j));
                }
                System.out.print(" ");
            
            word = "";
        }  
           
}
}
}
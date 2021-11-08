import java.util.*;
public class reverse_sentence
{    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any sentence");
        String s = sc.nextLine();
        for(int i =s.length() - 1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}
    


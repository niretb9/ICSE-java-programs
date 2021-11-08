import java.util.*;
public class toggle_case
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String s = sc.nextLine();
        for(int i =0;i<s.length();i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
            System.out.print (Character.toUpperCase(s.charAt(i)));
            else
            System.out.print(Character.toLowerCase(s.charAt(i)));
        }

    }
}
import java.util.*;
public class vowel_case_change
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.");
        String s = sc.nextLine();
        System.out.print(s.charAt(0));
        for(int i =1;i<s.length();i++)
        {
            if(s.charAt(i-1)=='a'||s.charAt(i-1)=='e'||s.charAt(i-1)=='i'||s.charAt(i-1)=='o'||s.charAt(i-1)=='u')
            {
            if(Character.isLowerCase(s.charAt(i)))
            System.out.print (Character.toUpperCase(s.charAt(i)));
            else
            System.out.print(Character.toLowerCase(s.charAt(i)));
               }
        else if(s.charAt(i-1)==' ')
        {
            if(s.charAt(i-2)=='a'||s.charAt(i-2)=='e'||s.charAt(i-2)=='i'||s.charAt(i-2)=='o'||s.charAt(i-2)=='u')
            {
            if(Character.isLowerCase(s.charAt(i)))
            System.out.print (Character.toUpperCase(s.charAt(i)));
            else
            System.out.print(Character.toLowerCase(s.charAt(i)));
             }
               else
           System.out.print(s.charAt(i));
    }
    else
    System.out.print(s.charAt(i));
}
}
}
                
        
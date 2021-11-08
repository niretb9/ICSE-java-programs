import java.util.*;
public class count_uppercase_letters
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String s = sc.nextLine();
        int count =0;
        for(int i =0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            count++;
        }
        System.out.println(count);
}
}        
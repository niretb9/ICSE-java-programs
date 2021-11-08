import java.util.*;
public class count_no_of_digits
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String s = sc.nextLine();
        int count =0;
        for(int i =0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            count++;
        }
        System.out.println(count);
    }
}        
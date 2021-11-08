import java.util.*;
public class piglatin_string
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String word = sc.nextLine();
        
        String piglatin = "";
        
        for(int i = 0;i<word.length();i++)
        {
            char x = word.charAt(i);
            if(x=='a'|| x=='e'|| x=='i'||x=='o'||x=='u')
            {
                piglatin = word.substring(i)+word.substring(0,i)+"ay";
             
                break;
            }
        }
       
        System.out.println(piglatin);
        
    }
}
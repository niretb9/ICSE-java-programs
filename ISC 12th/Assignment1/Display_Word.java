package Assignment1;
import java.util.*;

class Display_Word {
    public static void Longest (String wd){
        String[] splits = wd.split(" ");
        int count = 0, len = 0;
        for(String i : splits) {
            len = i.length();
            if(len>count){
                count=len;
            }
        }
        String lon = "";
        for(String j : splits) {
            if(j.length()==count){
                lon = j;
                break;
            }
        }
        System.out.println("Longest word is: "+lon);
        for(int i = 0;i<count;i++){
            char ch = lon.charAt(i);
            System.out.println(ch+"  :  "+(int) ch);
        }
    }
    public static void main(String[] args){
        System.out.print("Enter a Sentence:");
        Scanner sc = new Scanner(System.in);
        Display_Word.Longest(sc.nextLine());
    }
}

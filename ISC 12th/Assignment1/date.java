package Assignment1;
import java.util.Scanner;
public class date {
    public static boolean validateDate(String a) {
        boolean ret=false;
        try {
            if(a.charAt(0)!=0){
                if (a.charAt(2) == '/' && a.charAt(5) == '/' && a.length() == 10) {
                    System.out.println("Valid format");
                    ret=true;
                }
            }
            else{
                System.out.println("Invalid date");
                ret=false;
            }
        }
        catch(Exception e){
            System.out.println("Not a valid date format");
        }
        return ret;
    }
    public static String formatchange(String a){
        String d = a.substring(0,2);
        String m = a.substring(3,5);
        String y = a.substring(6,10);
        String ret = m+'/'+d+'/'+y;
        return ret;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a date in the format 'dd/mm/yyyy' : ");
        String date = input.nextLine();
        try{
            validateDate(date);
            System.out.print("Date in the format mm/dd/yyyy: ");
            String date2 = formatchange(date);
            System.out.println(date2);
        }
        catch(Exception e){
            System.out.println("An error occured");
        }
    }
}
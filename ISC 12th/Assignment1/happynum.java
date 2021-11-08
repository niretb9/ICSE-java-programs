package Assignment1;
import java.util.Scanner;
public class happynum {
    public static int ishappy(int n) {
        int rem, num = n;
        loop:
        while (num != 1 && num != 4) {
            if (n < 1) {
                break loop;
            }
            int sum = 0;
            while (num > 0) {
                rem = num % 10;
                sum = sum + (rem * rem);
                num = num / 10;
            }
            num = sum;
        }
        System.out.println(num);
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        sc.close();
        int a = happynum.ishappy(n);
        if (a == 1) {
            System.out.printf("%d is a happy number :)", n);
        } else {
            System.out.printf("%d is not a happy number :'(", n);
        }
    }
}

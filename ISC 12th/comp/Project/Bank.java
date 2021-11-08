package comp.Project;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
public class Bank {
    private long acc;
    private String name;
    private long bal;
    Scanner sc=new Scanner(System.in);
    //method to open an account
    public void openAcc(){
        System.out.print("Enter Account No: ");
        acc=sc.nextInt();
        System.out.print("Enter Name: ");//Error while space in String!!!
        name=sc.next();
        System.out.print("Enter Balance: ");
        bal=sc.nextLong();
    }
    //function to display account details
    void showAccount(){
        System.out.printf("["+acc+"] - "+name+" ,Balance = "+bal);
    }
    public String retAccount(){
        String b = ("Account Number: "+acc+"\nAccount Name  : "+name+"\nBalance       : "+bal);
        return(b);
    }
    //method to deposit money
    void deposit(){
        long amt;
        System.out.println("Enter Amount to Deposit: ");
        amt=sc.nextLong();
        bal=bal+amt;
    }
    //method to withdraw money
    void withdraw(){
        long amt;
        System.out.println("Enter Amount to withdraw: ");
        amt=sc.nextLong();
        if(bal>=amt){
            bal=bal-amt;
        }
        else{
            System.out.println("Error: Insufficient Balance");
        }
    }
    //function to search an account number
    boolean search(int acn) {
        if(acc==acn) {
            showAccount();
            return(true);
        }
        return(false);
    }
}
class Open_Bank extends Bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //create initial accounts
        System.out.print("Welcome\nPress enter to continue...");
        try{
            System.in.read();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            Bank arr[]=new Bank[1];
            for(int i=0;i<arr.length;i++) {
                arr[i]=new Bank();
                arr[i].openAcc();
            }
            //runs loop until menu 5 is not pressed
            int ch;
            do {
                System.out.println("-----Main Menu-----\n 1.Display All\n 2.Search By Account\n 3.Deposit\n 4.Withdrawal\n 5.Download Account Statement\n 6.Exit");
                System.out.print("Enter the number of the desired option: ");
                ch=sc.nextInt();
                switch(ch){
                    case 1:
                        for (int i = 0; i < arr.length; i++) {
                            arr[i].showAccount();
                        }
                        break;
                    case 2:
                        System.out.print("Enter Account number to Search: ");
                        int acn = sc.nextInt();
                        boolean found = false;
                        for (int i = 0; i < arr.length; i++) {
                            found = arr[i].search(acn);
                            if (found) {
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed: Account doesn't exist");
                        }
                        break;
                    case 3:
                        System.out.print("Enter Account No: ");
                        acn = sc.nextInt();
                        found = false;
                        for (int i = 0; i < arr.length; i++) {
                            found = arr[i].search(acn);
                            if (found) {
                                arr[i].deposit();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed: Account doesn't exist");
                        }
                        break;
                    case 4:
                        System.out.print("Enter Account No: ");
                        acn = sc.nextInt();
                        found = false;
                        for (int i = 0; i < arr.length; i++) {
                            found = arr[i].search(acn);
                            if (found) {
                                arr[i].withdraw();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed: Account doesn't exist");
                        }
                        break;
                    case 6:
                        System.out.println("Good Bye..");
                        break;
                    case 5:
                        System.out.println("Download [y/n]");
                        String v = sc.next();
                        if (v.equals("y")) {
                            try {
                                String a = "";
                                for (int i = 0; i < arr.length; i++) {
                                    a = arr[i].retAccount();
                                }
                                System.out.println("Downloading...");
                                String path = System.getProperty("user.home") + "/Desktop/Account_Statement.txt";
                                File mes = new File(path);
                                mes.createNewFile();
                                FileWriter writter = new FileWriter(path);
                                writter.write(a);
                                writter.close();
                                System.out.println("File has been stored in Desktop");
                            } catch (IOException e) {
                                System.out.println("Download Failed");
                                e.printStackTrace();
                            }
                        } else {
                            System.out.println("Returning to home page");
                            break;
                        }
                        break;
                }
            }
            while(ch!=6);
    }
}
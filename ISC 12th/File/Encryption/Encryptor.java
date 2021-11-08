package File.Encryption;
import java.util.*;
import java.io.*;

public class Encryptor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a message:");
        String m = input.nextLine();
        String enc = HyperCrypt.encrypt(m);
        System.out.print("Enter the path where the encrypted file will be stored :");
        String path = input.nextLine();
        try{
            File mes = new File(path);
            FileWriter writter = new FileWriter(path);
            writter.write(enc);
            writter.close();
            System.out.println("Encrypted data written to the file to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



    }
}

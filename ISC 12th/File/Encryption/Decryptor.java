package File.Encryption;

import java.io.*;
import java.util.Scanner;

public class Decryptor {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the path where the encrypted file is stored :");
            String path = sc.nextLine();
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String file = myReader.nextLine();
                String dec = HyperCrypt.decrypt(file);
                System.out.println("Data from file  :"+file);
                System.out.println("Decrypted file  :"+dec);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
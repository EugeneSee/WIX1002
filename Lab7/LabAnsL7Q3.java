package Lab7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LabAnsL7Q3 {
    public static void main(String[] args) {
        try{
            Scanner inputStream = new Scanner(new FileInputStream("L7Q3.txt"));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("reverse.txt"));
            String s = "";
            while(inputStream.hasNextLine()){
                s += inputStream.nextLine();
            }
            int count = s.length();
            for(int i= count - 1; i >= 0 ; i--){
                outputStream.print(s.charAt(i));
            }
            inputStream.close();
            outputStream.close();
        }catch(IOException e){
            System.out.println("Problem with the file I/O");
        }
    }
}

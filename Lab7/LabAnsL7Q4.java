package Lab7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LabAnsL7Q4 {
    public static void main(String[] args) {

        try{
            Scanner inputStream = new Scanner(new FileInputStream("L7Q4.txt"));
            int characterCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            while(inputStream.hasNext()){
                String line = inputStream.nextLine();
                lineCount++;
                String [] words = line.split(" ");
                wordCount += words.length;
                for(int i = 0; i <= words.length - 1; i++){
                    characterCount += words[i].length();
                }
            }
            System.out.println("Character : " + characterCount);
            System.out.println("Word : " + wordCount);
            System.out.println("Line : " + lineCount);
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found. ");
        }
    }
}

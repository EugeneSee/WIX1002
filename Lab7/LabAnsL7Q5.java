package Lab7;

import java.io.*;

public class LabAnsL7Q5 {
    public static void main(String[] args) {
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.dat"));
            System.out.println("Total Number of Record : " + inputStream.readInt());
            try{
                while(true){
                    System.out.println(inputStream.readUTF() + "   \t\t " + inputStream.readInt() + " \t" + inputStream.readChar());
                }

            }catch(EOFException e){
                inputStream.close();
            }

        }catch(FileNotFoundException e){
            System.out.println("File was not found. ");
        }catch(IOException e){
            System.out.println("Problem with the file input. ");
        }
    }
}

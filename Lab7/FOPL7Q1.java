package Lab7;

import java.io.*;

public class FOPL7Q1 {

    public static void main(String[] args) {

        try{
            String [][] array = {{"WXES1116", "Programming I"},
                                {"WXES1115", "Data Structure"},
                                {"WXES1110", "Operating System"},
                                {"WXES1112", "Computing Mathematics I"}};
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("course.dat"));

            for(int i = 0; i < array.length; i++){
                for(int j = 0; j < array[i].length; j++){
                    outputStream.writeUTF(array[i][j]);
                }
            }

        }catch (IOException e){
            System.out.println("There was an error with the file. ");
        }

        //try {
            //ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("course.dat"));
        //}catch (FileNotFoundException e){
            System.out.println("File is not found");
       // }


    }
}

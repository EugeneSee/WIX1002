package Lab7;

import java.io.*;
import java.util.Scanner;

public class LabAnsL7Q1 {
    public static void main(String[] args) {

        writeTable();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a course code : ");
        String coursecode = input.next();
        String [][] courses = readTable();
        String courseName = "";
        for(String [] course:courses){
            if(course[0].equals(coursecode)){
                courseName = course[1];
            }
        }
        if(courseName.equals("")){
            System.out.println("Invalid course code. ");
        }else{
            System.out.println("The course name is : " + courseName);

        }

    }

    public static void writeTable() {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("coursename.dat"));
            outputStream.writeUTF("WXES1116, Programming I");
            outputStream.writeUTF("WXES1115, Data Structure");
            outputStream.writeUTF("WXES1110, Operating System");
            outputStream.writeUTF("WXES1112, Computing Mathematics I");
            outputStream.close();

        } catch (IOException e) {
            System.out.println("An error occurred. ");
        }

    }

    public static String[][] readTable() {
        String binaryContent = "";
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("coursename.dat"));
            try {
                while (true) {
                    String line = inputStream.readUTF();
                    binaryContent += line + ";";
                }
            } catch (EOFException e) {
                inputStream.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found. ");
        } catch (IOException e) {
            System.out.println("Problem with file input. ");
        }
        String[] courses = binaryContent.split(";");
        String[][] content = new String[courses.length][2];
        for(int i = 0; i < courses.length; i++){
            content[i] = courses[i].split(",");
        }
        return content;
    }
}

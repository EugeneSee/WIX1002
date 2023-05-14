package Lab7;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class LabAnsL7Q2 {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter outputStream = new PrintWriter(new FileOutputStream("index.txt"));
        try {
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            while(in.hasNextLine()){
                outputStream.print(in.nextLine());
            }
            outputStream.close();
        }
        catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}


package Lab2;

import java.text.DecimalFormat;
import java.util.*;

//@author Eugene See S2173494

public class FOPL2Q3{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){

        double max = 50;
        double min = 10;

        Random r1 = new Random();
        double Number1 = r1.nextDouble(max - min + 1) + min;

        Random r2 = new Random();
        double Number2 = r2.nextDouble(max - min + 1) + min;

        Random r3 = new Random();
        double Number3 = r3.nextDouble(max - min + 1) + min;

        double Sum = Number1 + Number2 + Number3;
        double Average = (Sum)/3;

        System.out.println("First number : " + df.format(Number1));
        System.out.println("Second number : " + df.format(Number2));
        System.out.println("Third number : " + df.format(Number3));
        System.out.println("Sum of three numbers : " + df.format(Sum));
        System.out.println("Average of three numbers : " + df.format(Average));
    }
}
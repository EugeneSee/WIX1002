package Lab2;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.NumberFormat;

//@author Eugene See S2173494

public class FOPL2Q6 {

    public static void main(String[] args){

        NumberFormat nf = new DecimalFormat("0.######E0");
        System.out.print("Enter the amount of water in gram : ");
        Scanner in = new Scanner(System.in);
        double M = in.nextDouble();
        M = M/1000;
        System.out.print("Enter the initial temperature in Fahrenheit : ");
        double initialt = in.nextDouble();
        initialt = (initialt - 32)/1.8;
        System.out.print("Enter the final temperature in Fahrenheit : ");
        double finalt = in.nextDouble();
        finalt = (finalt - 32)/1.8;
        double Q = M * (finalt - initialt) * 4184;
        System.out.println("The energy needed is "+nf.format(Q));

        in.close();
    }
}

package Lab2;

import java.util.*;
import java.text.DecimalFormat;

//@author Eugene See S2173494

public class FOPL2Q2 {  

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){

    System.out.print("The price of the car : ");
    Scanner scanner = new Scanner(System.in);
    double P = scanner.nextDouble();

    System.out.print("Down payment : ");
    double D = scanner.nextDouble();

    System.out.print("Interest rate in % : ");
    double R = scanner.nextDouble();

    System.out.print("Loan duration in year : ");
    double Y = scanner.nextDouble();

    double M = (P - D) * (1 + R*Y/100) / (Y * 12);

    System.out.print("Monthly Payment : RM" + df.format(M));

    scanner.close();

    }
}
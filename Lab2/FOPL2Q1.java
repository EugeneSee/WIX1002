package Lab2;

import java.text.DecimalFormat;
import java.util.*;

//@author Eugene See S2173494

public class FOPL2Q1{

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){

        System.out.print("Enter the temperature in Fahrenheit : ");
        Scanner scanner = new Scanner(System.in);
        double FahTemp = scanner.nextDouble();
        scanner.close();

        double CelsiusTemp = (FahTemp - 32)/1.8;

        System.out.println("Temperature in Celsius : " + df.format(CelsiusTemp) + "°C");
        
    }
}
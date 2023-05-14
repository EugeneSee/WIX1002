package Lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

//@author Eugene See S2173494

public class FOPL3Q3 {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){

        System.out.print("Sales volume : ");
        Scanner scanner = new Scanner(System.in);
        double sales = scanner.nextDouble();

        if(sales <= 100){
            double commission = sales * 0.05;
            System.out.println("Commission is RM" + df.format(commission));
        }
        else if(sales>100 && sales<=500 ){
            double commission = sales * 0.075;
            System.out.println("Commission is RM" + df.format(commission));
        }
        else if(sales>500 && sales<=1000){
            double commission = sales * 0.1;
            System.out.println("Commission is RM" + df.format(commission));
        }
        else if (sales>1000){
            double commission = sales * 0.125;
            System.out.println("Commission is RM" + df.format(commission));
        }

        scanner.close();
    }
}

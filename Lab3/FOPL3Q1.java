package Lab3;
import java.util.Scanner;

//@author Eugene See S2173494

public class FOPL3Q1 {

    public static void main(String[] args) {

        boolean isInvalidOperand = false;

        System.out.print("Enter the first integer : ");
        Scanner scanner1 = new Scanner(System.in);
        double a = scanner1.nextDouble();
        System.out.print("Enter the second integer : ");
        double b = scanner1.nextDouble();

        System.out.print("Enter the operand : ");
        Scanner scanner2 = new Scanner(System.in);
        String String = scanner2.nextLine();
        char operand = String.charAt(0);

        if (operand == '+'){
            double c = a + b;
            System.out.printf("%f + %f = %f",a,b,c);
        }
        else if (operand == '-') {
            double c = a - b;
            System.out.printf("%f - %f = %f",a,b,c);
        }
        else if (operand == '*') {
            double c = a * b;
            System.out.printf("%f * %f = %f", a, b, c);
        }
        else if (operand == '/') {
            double c = a / b;
            System.out.printf("%f / %f = %f", a, b, c);
        }
        else if (operand == '%') {
            double c = a % b;
            System.out.printf("%f %% %f = %f", a, b, c);
        }
        else
            System.out.println("Invalid input. ");



        scanner1.close();
        scanner2.close();
    }
}
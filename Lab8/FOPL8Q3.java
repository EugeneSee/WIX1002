package Lab8;

import java.util.Scanner;

public class FOPL8Q3 {

    public static void main(String[] args) {
        weightCalculator w = new weightCalculator();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter your height : ");
        double height = sc.nextDouble();

        w.input(age, height);
        w.ok();
    }
}

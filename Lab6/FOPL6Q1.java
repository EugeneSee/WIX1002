package Lab6;
import java.util.Scanner;
public class FOPL6Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int okk = triangle(number);
        System.out.println("The triangular number is : " + okk);
    }

    public static int triangle(int number) {

        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
        }
        return sum;
    }
}

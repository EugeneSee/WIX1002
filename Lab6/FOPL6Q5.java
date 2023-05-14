package Lab6;
import java.util.Scanner;
import java.util.Random;
public class FOPL6Q5 {

    public static void main(String[] args) {

        int x, y, z, counter = 0;
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        while(true){

            System.out.println("Enter a negative number to quit. ");
            x = rn.nextInt(12) + 1;
            y = rn.nextInt(12) + 1;
            System.out.print(x + " x " + y + " = ");
            z = sc.nextInt();
            if(z < 0)
                break;
            counter += check(x, y, z) ? 1 : 0;

        }
        sc.close();
        System.out.println("Your Score is : " + counter);
    }
    public static boolean check(int x, int y, int z){

        return ((x*y) == z);
    }
}

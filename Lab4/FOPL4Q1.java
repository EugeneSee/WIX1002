package Lab4;
import java.util.*;

//@author Eugene See S2173494

public class FOPL4Q1{

    public static void main(String[] args){
        System.out.print("Enter an integer : ");
        Scanner scanner = new Scanner(System.in);
        long integer = scanner.nextLong();

        System.out.print("The factors are : ");

        // To print all factors
        for (int i = 1; i <= integer; i++){
            if (integer % i == 0){
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}

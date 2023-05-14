package Lab4;
import java.util.*;

//@author Eugene See S2173494

public class FOPL4Q8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer (1-100) : ");
        int integer = scanner.nextInt();
        int counter = 0;
        int num = 0;
        while (counter < integer) {
            if(isPrimeNumber(num)){
                System.out.print(num + " ");
                counter++;
            }
            num++;
        }

    }
    public static boolean isPrimeNumber(int integer){
        if(integer < 2)
            return false;

        if(integer == 2)
            return true;

        for(int i = 2; i < integer; i++){
            if(integer % i == 0){
                return false;
            }
        }
        return true;
    }
}

package Lab4;
import java.util.*;

//@author Eugene See S2173494

public class FOPL4Q2 {

    public static void main(String[] args){

        System.out.print("Enter an integer : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num, total = 0;

        for(int i = 1; i <= n; i++){
            num = 0;
            for(int j = 1; j <= i ;j++){
                num = num + j;
            }
            total = total + num;
        }
        System.out.println("Your answer is : " + total);
    }

}

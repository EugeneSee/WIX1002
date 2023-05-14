package Lab6;
import java.util.*;
public class Q2TUTOANS {

    public static void main(String[] args) {
        Scanner character = new Scanner(System.in);
        System.out.println("Triangle Height : ");
        int height = character.nextInt();
        System.out.println("");
        //triangle
        for(int i = height; i > 0; i--){
            multiprint(i,'n');

            multiprint(2*(height-1)+1,'n');
            System.out.println("");
        }

        System.out.println("");

        System.out.println("Diamond Height : ");
        height = character.nextInt();
        System.out.println("");
        //diamond
        for(int j = height / 2; j >= 0; j--){
            multiprint(j, 'n');
            multiprint(2 * (height / 2 - j) + 1, 'n');
            System.out.println("");
        }

        for(int k = 1; k <= height / 2; k++){
            multiprint(k, 'n');
            multiprint(2 * (height / 2 - k) + 1, 'n');
            System.out.println("");
        }

    }

    public static void multiprint(int n, char c){
        for(int i = 0; i < n; i++){
            System.out.print(c);
        }
    }
}

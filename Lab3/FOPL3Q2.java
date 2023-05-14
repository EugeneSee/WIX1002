package Lab3;
import java.util.*;

//@author Eugene See S2173494

public class FOPL3Q2 {

    public static void main(String[] args){

        Random rn = new Random();
        int number = rn.nextInt(5) +1;

        if(number == 1 ){
            System.out.println("1 is one.");
        }
        else if (number == 2){
            System.out.println("2 is two.");
        }
        else if (number == 3){
            System.out.println("3 is three.");
        }
        else if (number == 4){
            System.out.println("4 is four. ");
        }
        else if (number == 5){
            System.out.println("5 is five. ");
        }
    }
}

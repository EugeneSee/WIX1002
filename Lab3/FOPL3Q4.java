package Lab3;
import java.util.*;

//@author Eugene See S2173494

public class FOPL3Q4 {

    public static void main(String[] args){

        Random rn = new Random();
        int player11 = rn.nextInt(6)+1;
        int player12 = rn.nextInt(6)+1;
        int player1 = player11 + player12;

        int player21 = rn.nextInt(6)+1;
        int player22 = rn.nextInt(6)+1;
        int player2 = player21 + player22;

        System.out.printf("Player 1 gets %d \n",player1);
        System.out.printf("Player 2 gets %d \n",player2);

        if(player1>player2){
            System.out.println("Player 1 wins! ");
        }
        else if(player1<player2){
            System.out.println("Player 2 wins! ");
        }
        else if(player1==player2){
            System.out.println("Tie! ");
        }


    }
}

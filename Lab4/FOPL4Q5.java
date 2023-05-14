package Lab4;
import java.util.Random;

//@author Eugene See S2173494

public class FOPL4Q5 {

    public static void main(String[] args) {

        int dice1 = 0;
        int dice2 = 0;
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 1; sum1 <= 100 && sum2 <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println("Player 1's turn");
                sum1 = dicePlayer(sum1, dice1);
                System.out.println();
            } else {
                System.out.println("Player 2's turn");
                sum2 = dicePlayer(sum2, dice2);
                System.out.println();
            }
        }

            System.out.println("Player 1 gets : " + sum1);
            System.out.println("Player 2 gets : " + sum2);
            if(sum1 > sum2){
                System.out.println("Player 1 wins! ");
            }
            else if(sum2 > sum1){
                System.out.println("Player 2 wins! ");
            }
            else if(sum1 == sum2){
                System.out.println("It's a tie! ");
            }
        }

        static int dicePlayer(int sum, int dice){

        Random rn = new Random();
        while(true){
            dice = rn.nextInt(6) + 1;
            System.out.println("Dice number : " + dice);
            if(dice == 6){
                sum += dice;
            }
            else {
                sum += dice;
                break;
            }
        }
        return sum;
    }
}
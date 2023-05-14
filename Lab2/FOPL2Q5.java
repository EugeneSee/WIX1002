package Lab2;

import java.util.Random;

//@author Eugene See S2173494

public class FOPL2Q5{


    public static void main(String[] args){

        Random rn = new Random();
        int number = rn.nextInt(10000)+1;
        int sum = 0;

        System.out.printf("The number generated is : %d\n",number);

        while(number>0){
            sum = sum + number % 10;
            number = number / 10;
        }

        System.out.printf("The sum of all digits is : %d",sum);

    }
}

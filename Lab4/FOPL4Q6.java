package Lab4;
import jdk.jfr.Unsigned;

import java.util.Random;

//@author Eugene See S2173494

public class FOPL4Q6 {

    public static void main(String[] args) {

        Random rn = new Random();
        int randomNumber = rn.nextInt() * Integer.MAX_VALUE;
        int digit = 1;

        if(randomNumber <= 0){
            randomNumber = randomNumber * -1;
        }

        System.out.println("The number random integer generated is : " + randomNumber);

        while((randomNumber/=10) != 0){
            digit += 1;
        }

        System.out.println("The number of digit is : " + digit);

    }
}

package Lab5;
import java.util.Arrays;
import java.util.Random;

public class FOPL5Q2 {

    public static void main(String[] args) {

        int[] RandInt = new int[10];
        Random rn = new Random();
        boolean[] repeat = new boolean[21];

        for(int i = 0; i < 10; i++){
            int rand = rn.nextInt(20)+1;
            if(!repeat[rand])
                repeat[rand] = true;
            else {
                do{
                    rand = rn.nextInt(20)+1;
                }while(repeat[rand]);
            }
        RandInt[i] = rand;
        }

        Arrays.sort(RandInt);
        System.out.println(Arrays.toString(RandInt));
    }
}

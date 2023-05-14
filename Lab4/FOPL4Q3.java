package Lab4;
import java.util.*;

//@author Eugene See S2173494

public class FOPL4Q3 {

    public static void main(String[] args) {

        double x ,sum = 0, n = 0, max = 0, min = 1000, average, sumthensquare = 0, squarethensum = 0, s;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a score (negative score to quit) : ");
            x = scanner.nextInt();

            if(x<0)
                break;

            if(x > max)
                max = x;

            if(x <= min)
                min = x;

            sum += x;
            n += 1;
            squarethensum += Math.pow(x,2);
        }
        sumthensquare = Math.pow(sum,2);
        s = Math.sqrt((squarethensum - (sumthensquare/n))/(n-1));
        average = sum/n;
        System.out.println("Minimum Score : " + min);
        System.out.println("Maximum Score : " + max);
        System.out.println("Average Score : " + average);
        System.out.printf("Standard Deviation : %.2f", s);
    }

}

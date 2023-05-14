package Lab5;

import java.util.Scanner;
import java.util.Random;

public class FOPL5Q1 {

    public static void main(String[] args) {

        int max = -1, sum = 0, average = 0, min = 101;
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        Random rn = new Random();

        for(int i = 0; i < n ; i++){

            scores[i] = rn.nextInt(100) + 1;
            if(scores[i] > max)
                max = scores[i];
            if(scores[i] < min)
                min = scores[i];
            sum += scores[i];
        }
        average = sum/n;

        System.out.print("The scores printed are : ");
        for(int i = 0; i < n ; i++){
            System.out.print(scores[i] + " ");
        }

        System.out.println("\nThe highest score : " + max);
        System.out.println("The lowest score : " + min);
        System.out.println("The average score is : " + average);

    }
}

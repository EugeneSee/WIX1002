package Lab5;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FOPL5Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.print("Enter the number of employees : ");
        int n = sc.nextInt();

        int [][] workhours = new int [n][7];
        int [] total = new int [n];

        for(int i = 0 ; i<workhours.length; i++){
            for(int j = 0; j < workhours[i].length; j++){
                workhours[i][j] = rn.nextInt(8)+1;
                total[i] += workhours[i][j];
            }
        }
        System.out.println("The working hours and total hours of the employees : \n");

        for(int z = 0; z < workhours.length; z++){
            System.out.println((z+1) + ". " + Arrays.toString(workhours[z]) +  " Total : " + total[z]);
            System.out.println();
        }




    }
}

package Lab5;

import java.util.Random;
import java.util.Scanner;

public class FOPL5Q5 {

    public static void main(String[] args) {
        System.out.println("A list of 20 random integer within 1-100");
        Random rn = new Random();
        int[] number = new int[20];

        for(int i = 0; i < 20; i++){
            int ran = rn.nextInt(100)+1;
            number[i] = ran;
        }

        for(int i = 0; i < 20; i++){

            if(i == 19){
                System.out.print(number[i]);
            }
            else
                System.out.print(number[i]+" , ");

        }
        System.out.println("");

        for(int order = 1; order < number.length; order++){
            for(int i = 0; i < number.length - order; i++){
                if(number[i] < number[i+1]){
                    int hold = number[i];
                    number[i] = number[i+1];
                    number[i+1] = hold;
                }
            }
        }

        System.out.println("Descending Order : ");
        for(int i = 0; i < number.length; i++){


            if(i==19){
                System.out.print(number[i]);
            }
            else
                System.out.print(number[i]+" , ");


        }

        System.out.print("\nEnter a number to search : ");
        Scanner input = new Scanner(System.in);
        int search = input.nextInt();

        int linear;
        boolean isFoundLinear = false;
        for(linear = 0; linear < number.length; linear++){
            if(number[linear] == search){
                isFoundLinear = true;
                break;
            }
        }
        System.out.println(search + (isFoundLinear ? "" : " not ") + " found");
        System.out.println("Linear search : " + linear + " loop(s)");

        int low = 0;
        int high = number.length - 1;
        int count = 0;
        boolean isFoundBinary = false;
        while(low<=high){
            int middle = (low+high)/2;
            if(search == number[middle]){
                isFoundBinary = true;
                break;
            }
            else if(search > number[middle]){
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
            count++;
        }

        System.out.println(search + (isFoundBinary ? " " : " not ") + " found");
        System.out.println("Binary Search : " + count + " loop(s)");

    }
}

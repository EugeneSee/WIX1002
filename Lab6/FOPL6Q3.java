package Lab6;
import java.util.Scanner;
public class FOPL6Q3 {

    public static void main(String[] args) {

        int [] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Enter a number (max 10 digits) : ");
            numbers[i] = sc.nextInt();
        }

        for(int j = 0; j < numbers.length; j++){
            System.out.print(reverseNum(numbers[j]) + " ");
        }
        sc.close();

    }
    public static int reverseNum(int n){
            int reverse = 0;
            while(n != 0)
            {
                int remainder = n % 10;
                reverse = reverse * 10 + remainder;
                n = n/10;
            }
        return reverse;
    }
}




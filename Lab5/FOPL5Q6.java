package Lab5;
import java.util.*;

public class FOPL5Q6 {

    public static void main(String[] args) {

        System.out.print("Enter the number of rows of Pascal Triangle to generate : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int [] p = new int[rows];
        p[0] = 1;

        for(int i = 0; i < rows; i++)
        {
            p[i] = 1;
            for(int j = 0; j <= i; j++)
            {
                System.out.print(p[i]+ " ");
                p[i] = p[i] * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

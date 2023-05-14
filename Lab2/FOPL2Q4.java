package Lab2;

import java.util.*;

//@author Eugene See S2173494

public class FOPL2Q4 {

    public static void main(String[] args){
        System.out.print("Enter the number of seconds : ");
        Scanner scanner = new Scanner(System.in);
        int TotalSeconds = scanner.nextInt();
        int seconds = TotalSeconds%60;
        int hours = TotalSeconds/60;
        int minutes = hours%60;
        hours = hours/60;

        scanner.close();
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds",TotalSeconds,hours,minutes,seconds);

    }
}

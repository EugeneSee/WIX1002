package Lab4;
import java.util.*;

public class FOPL4Q4 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0));
        System.out.print("Enter first day of the year : ");
        int firstDay = sc.nextInt();
        int totalDaysBeforeMay = 119 + (isLeapYear? 1: 0);
        int totalDaysBeforeAug = 211 + (isLeapYear? 1: 0);
        int startDayOfMay = (firstDay + totalDaysBeforeMay)%7;
        int startDayOfAug = (firstDay + totalDaysBeforeAug)%7;

        for(int k = 0; k < 2;k++){ //may and aug
            int day = 1;
            boolean isFirstRun = true;
            System.out.println("\t\t   " + (k == 0 ? "May":"Aug") + "" + year);
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
            outer:
            while(true){
                for(int i = 0; i < 7; i++){
                    if(isFirstRun) {
                        i = (k == 0 ? startDayOfMay : startDayOfAug);
                        for (int j = 0; j < i; j++) {
                            System.out.print(" \t");
                        }
                        isFirstRun = false;
                    }
                        System.out.print(day + "\t");
                        day++;
                        if(day > 31){
                            System.out.println("");
                            break outer;
                        }
                        System.out.print("");
                    }
                    System.out.println("");
            }
        }
    }
}


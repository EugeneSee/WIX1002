package Lab3;
import java.util.*;

//@author Eugene See S2173494

public class FOPL3Q5 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a : ");
        double a = in.nextDouble();
        System.out.print("Enter b : ");
        double b = in.nextDouble();
        System.out.print("Enter c : ");
        double c = in.nextDouble();
        System.out.print("Enter d : ");
        double d = in.nextDouble();
        System.out.print("Enter e : ");
        double e = in.nextDouble();
        System.out.print("Enter f : ");
        double f = in.nextDouble();

        double x = (e*d-b*f)/(a*d-b*c);
        double y = (a*f-e*c)/(a*d-b*c);

        if(a*d - b*c == 0){
            System.out.println("The equation has no solution. ");
        }
        else{
            System.out.printf("x:%f\n",x);
            System.out.printf("y:%f",y);
        }

        in.close();
    }

}

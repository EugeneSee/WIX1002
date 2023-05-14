package Lab3;
import java.util.*;

//@author Eugene See S2173494

public class FOPL3Q6 {

    public static void main(String[] args){

        System.out.print("Enter the radius of a circle : ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        System.out.print("Enter the x-coordinate of the point : ");
        double x = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the point : ");
        double y = scanner.nextDouble();

        double x2 = Math.pow(x,2);
        double y2 = Math.pow(y,2);
        double a = Math.sqrt(x2+y2);

        if(radius > a){
            System.out.println("Point is inside the circle. ");
        }
        else if(radius == a){
            System.out.println("Point is on the line of the circle. ");
        }
        else if(radius < a){
            System.out.println("Point is outside of the circle. ");
        }

        scanner.close();

    }
}

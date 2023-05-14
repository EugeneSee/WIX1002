package Lab8;
import java.util.Scanner;

public class weightCalculator {

    private static int age;
    private static double height;
    private static double recommendedWeight;

    private void recommendedWeight(){
        recommendedWeight = (height - 100 + age / 10) * 0.9;
    }

    public void input(int age, double height){
        this.age = age;
        this.height = height;
    }

    public void ok(){
        recommendedWeight();
        System.out.println("Age : " + age + "\n" + "Height : " + height + "\n" +
                "Recommended Weight : " + recommendedWeight);
    }

}

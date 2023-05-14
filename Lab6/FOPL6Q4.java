package Lab6;

public class FOPL6Q4 {

    public static void main(String[] args) {
        System.out.println("GCD (24, 8) : " + gcd(24, 8 ));
        System.out.println("");
        System.out.println("GCD (200, 425) : " + gcd(200, 425));
    }

    public static int gcd(int a, int b ){
        if(a==0)
            return b;
        System.out.println(b + " mod " + a + " - " + b % a);
        return gcd(b%a, a);
    }
}

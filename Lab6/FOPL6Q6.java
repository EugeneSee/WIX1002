package Lab6;

public class FOPL6Q6 {

    public static void main(String[] args){
        int count = 0;
        System.out.println("The first 20 prime number is : ");

        for(int i = 2; count<20; i++){
            if(isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        count = 0;
        System.out.println("\nThe first 20 palindrome prime number is: ");
        for(int j = 2; count<20; j++) {
            if(isPrime(j) && isEmirp(j)){
                System.out.print(j + " ");
                count++;
            };
        }

    }

    // void, (boolean int double String long short byte
    public static boolean isPrime(int num){
        if(num%2 == 0 && num!=2)
            return false;

        for(int i = 3; i<=num/2; i++){
            if(num%i==0)
                return false;
        }

        return true;
    }

    static boolean isEmirp(int num){
        String number = num +"";
        String palindrome = "";

        for(int i = number.length()-1; i>=0; i--){
            palindrome+=number.charAt(i);
        }
        if(palindrome.equals(number)) return true;

        return false;
    }
}
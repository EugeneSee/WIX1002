package Lab6;

public class LabExampleQ6 {

    public static void main(String[] args) {

        System.out.println("First 20 palindromic prime");
        int n = 2, cnt = 0;
        while(cnt < 20){
            if(isPrime(n)){
                System.out.println(n + " ");
                cnt++;
            }
        n++;
        }
    }

    public static boolean isPalindromicPrime(int num){
        if(isPrime(num)){
            return false;
        }else{
    //        return num == reverseNum = true;
        }
    //    return isPalindromicPrime();
    return true;
    }

    public static boolean isPrime(int num){
        boolean isPrime = true;
        for(int i = 2; i < num/2; ++i){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int reverseNum(int num){
        int reversedNum = 0;
        String num9tr = Integer.toString(num);
        for(int i = num9tr.length() - 1; i > 0; i++){
            reversedNum = reversedNum * 10 + (num9tr.charAt(i) - '0');
        }
        return reversedNum;
    }
}


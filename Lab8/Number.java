package Lab8;

import java.util.Random;

public class Number {
    private Random ran = new Random();
    private int[] array;
    private int size;

    public Number() {
        this(10);
    }

    public Number(int size) {
        this(size, 100);
    }

    public Number(int size, int range) {
        this.size = size;
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(range + 1);
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % 1 == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public void displayEven() {
        System.out.println("Even numbers : ");
        for (int i = 0; i < this.array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("");
    }

    public void displayPrime() {
        System.out.println("Prime Numbers : ");
        for (int i = 0; i < this.array.length; i++) {
            if (isPrime(array[i])) {
                System.out.println(array[i] + " ");
            }
        }
        System.out.println("");
    }

    public void displayMax() {
        int max = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max number : " + max);
    }

    public void displayMin() {
        int min = size;
        for (int i = 0; i < this.array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min number : " + min);
    }

    public void displayAverage() {
        int totalNumber = 0;
        int total = 0;
        double average;
        for (int i = 0; i < this.array.length; i++) {
            total += array[i];
            totalNumber++;
        }
        average = total / size;
        System.out.println("Average : " + average);

    }

    public void displaySquare() {
        int square = 0;
        System.out.print("Square numbers : ");
        for (int i = 0; i < this.array.length; i++) {
            double sqrt = Math.sqrt(array[i]);
            int x = (int) sqrt;
            if (Math.pow(sqrt, 2) == Math.pow(x,2) && array[i] != 0){
                square = array[i];
                System.out.print(square + " ");
            }
        }
        System.out.println("");
    }

    public void displayAll(){
        System.out.print("Generated numbers : ");
        for(int i = 0; i < this.array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
package Lab5;

public class FOPL5Q4 {

    public static void main(String[] args) {

        System.out.println("3 by 3 Matrix");
        int [][] arr = {{1, 5, 7}, {3, 6, 9}, {5, 3, 8}};

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" " + arr[i][j] + "\t");
            }
            System.out.println(" ");
        }

        System.out.println("After rotating 90 degrees clockwise ");
        for(int i = 0; i < 3; i++){
            for(int j = 2; j >= 0; j--){
                System.out.print(" " + arr[j][i] + "\t");
            }
            System.out.println(" ");
        }
    }
}

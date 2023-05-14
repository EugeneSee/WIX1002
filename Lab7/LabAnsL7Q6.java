package Lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LabAnsL7Q6 {

    public static void main(String[] args) {
        String productContent = "";
        String orderContent = "";
        try{
            Scanner inputStream = new Scanner(new FileInputStream("product.txt"));
            while(inputStream.hasNextLine()){
                productContent += inputStream.nextLine();
                productContent += inputStream.hasNextLine() ? ";" : "";
            }
            inputStream = new Scanner(new FileInputStream("order.txt"));
            while(inputStream.hasNextLine()){
                orderContent += inputStream.nextLine();
                orderContent += inputStream.hasNextLine() ? ";" : "";
            }
            inputStream.close();

        }catch(FileNotFoundException e){
            System.out.println("File is not found. ");
        }

        String [] product = productContent.split(";");
        String [] order = orderContent.split(";");

        String [][] productDetails = new String[product.length][3];
        String [][] orderDetails = new String[order.length][3];

        for(int j = 0; j < product.length; j++){
            productDetails[j] = product[j].split(",");
        }

        for(int j = 0; j < order.length; j++){
            orderDetails[j] = order[j].split(",");
        }
        System.out.println("ProductID\tProductName\t\tQuantity\tPricePerUnit\tTotal");
        for(int j = 0; j <  orderDetails.length; j++){
            for(int k = 0; k < productDetails.length; k++){
                if(orderDetails[j][1].equals(productDetails[k][0])){
                    double totalPrice = Double.parseDouble(productDetails[k][2]) * Integer.parseInt(orderDetails[j][2]);
                    System.out.printf(orderDetails[j][1] + "\t\t%-20s" + "\t" + orderDetails[j][2] + "\t\t" +
                            productDetails[k][2] + "\t\t%.2f\n", productDetails[k][1], totalPrice);
                }
            }
        }

    }
}

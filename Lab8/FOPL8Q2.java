package Lab8;

import java.util.Scanner;

public class FOPL8Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Enter IC or Passport Number : ");
        String ic = input.nextLine();
        System.out.println("Enter Deposit Amount : ");
        double deposit = input.nextDouble();
        BankAccount ba = new BankAccount(name, ic, deposit);
        System.out.println("Opening a savings account");
        services:while(true){
            System.out.println("\n\n1: Deposit Service");
            System.out.println("2: Withdrawal Service");
            System.out.println("3: Check Balance ");
            System.out.println("0: Quit");
            System.out.println("Choose the service above : ");
            int choice = input.nextInt();
            switch(choice){
                case 1 :
                    System.out.print("\nEnter deposit amount : ");
                    double depositAmount = input.nextDouble();
                    ba.depositMoney(depositAmount);
                    break;

                case 2 :
                    System.out.println("\nEnter withdrawal amount ");
                    double withdrawalAmount = input.nextDouble();
                    ba.withdrawMoney(withdrawalAmount);
                    break;

                case 3 :
                    ba.displayBalance();
                    break;

                case 0:
                    System.out.println("Thank you for choosing us");
                    break services;
            }
        }
    }
}


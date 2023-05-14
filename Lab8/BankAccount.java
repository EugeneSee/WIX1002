package Lab8;

import java.awt.image.BandCombineOp;

public class BankAccount {
    private double currentBalance;
    private String name;
    private String ic;
    private double deposit;

    public BankAccount(){
        this(null,null,0);
    }
    public BankAccount(String n, String i, double d){
        this.currentBalance = 0;
        name = n;
        ic = i;
        deposit = d;
        currentBalance += d;
    }
    public void depositMoney(double d){
        this.currentBalance += d;
        System.out.printf("RM%.2f deposited successfully\n", d);
    }

    public void withdrawMoney(double d){
        if(this.currentBalance - d < 0){
            System.out.printf("Sorry, you cannot withdraw more than current balance of RM%.2f\n", this.currentBalance);
        }else{
            this.currentBalance -= d;
            System.out.printf("RM%.2f withdrawn successfully\n", d);
        }
    }
    public void displayBalance(){
        System.out.printf("Current Balance for %s is RM%.2f\n", this.name, this.currentBalance);
    }
}

package Lab4;

import java.util.Scanner;

        public class FOPL4Q7{
            public static void main(String [] args){
                Scanner scanner = new Scanner(System.in);
                double totalInterest = 0;

                System.out.print("Enter principal amount: ");
                int P = scanner.nextInt();

                System.out.print("Enter interest in %: ");
                double I = scanner.nextInt();

                System.out.print("Enter total number of month(s): ");
                int N = scanner.nextInt();

                System.out.printf("%-15s%-20s%-15s%-15s%-20s%-20s%n","Month","Monthly Payment","Principal","Interest","Unpaid Balance","Total Interest");

                double M = (P * (I/1200))/(1-Math.pow(1+I/1200, -N));
                for(int i =1; i<=N; i++){
                    int n = i;
                    double C = M * Math.pow(1+(I/1200), -(1+N-n));
                    double L = M - C;
                    double R = L/(I/1200)-C;
                    totalInterest += L;
                    System.out.printf("%-15d%-20.2f%-15.2f%-15.2f%-20.2f%-20.2f%n",i,M,C,L,R,totalInterest);

                }
            }
        }


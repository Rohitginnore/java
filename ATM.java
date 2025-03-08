 import java.util.Scanner;

public class if_else_and_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 double balance = 50000;
             System.out.println(balance);
             System.out.println("bank balance");
        System.out.println("1.withdraw");
        System.out.println("2.deposit");
        System.out.println("3.check balance");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("withdraw");
                double withdraw = sc.nextDouble();
                if (withdraw <= balance) {
                    balance =   balance-withdraw;
                    System.out.println("available balance is");
                    System.out.println(balance);
                } else {
                    System.out.println("insafficiant balance in account");
                }
                break;
            case 2:
                System.out.println("Deposit");
                double deposit = sc.nextDouble();
                balance = balance + deposit;
                System.out.println("now balance");
                System.out.println(balance);
                break;
            case 3:
                System.out.println("current balance");
                System.out.println(balance);
        }
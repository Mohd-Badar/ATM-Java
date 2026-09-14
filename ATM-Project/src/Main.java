// Project: ATM System (Java Console Application)
// Author: Mohd Badar
// Date: 6 September 2026
// Integrated core banking features including balance retrieval, instant deposits, and secure cash withdrawals.


import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 1000;
        int choice;

        while (true) {
            System.out.println("\n<--- ATM Menu --->");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your balance: " + balance);
            }
            else if (choice == 2) {
                System.out.print("Enter deposit money: ");
                int deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Money added. New balance: " + balance);
            }

            else if (choice == 3) {
                System.out.print("Enter withdraw amount: ");
                int withdraw = sc.nextInt();

                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Withdraw Successful. Balance = " + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using ATM!");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}

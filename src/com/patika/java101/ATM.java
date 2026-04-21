package com.patika.java101;

import java.util.Scanner;

public class ATM {
    static void main() {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {

            System.out.print("Username: ");
            userName = input.nextLine();

            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {

                System.out.println("Welcome to the Bank!");

                do {
                    System.out.println("1- Deposit Money");
                    System.out.println("2- Withdraw Money");
                    System.out.println("3- Check Balance");
                    System.out.println("4- Exit");

                    System.out.print("Select: ");
                    select = input.nextInt();

                    switch (select) {

                        case 1:
                            System.out.print("Amount: ");
                            int deposit = input.nextInt();
                            balance += deposit;
                            break;

                        case 2:
                            System.out.print("Amount: ");
                            int withdraw = input.nextInt();

                            if (withdraw > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= withdraw;
                            }
                            break;

                        case 3:
                            System.out.println("Balance: " + balance);
                            break;

                        case 4:
                            System.out.println("Goodbye!");
                            break;

                        default:
                            System.out.println("Invalid selection!");
                    }

                } while (select != 4);

                break;

            } else {
                right--;
                System.out.println("Wrong username or password!");

                if (right == 0) {
                    System.out.println("Account blocked. Contact bank.");
                } else {
                    System.out.println("Remaining attempts: " + right);
                }
            }
        }

        input.close();
    }
}

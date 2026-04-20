package com.patika.java101;

import java.util.Scanner;

public class KullaniciGirisi {
    static void main() {
        String username, password, newPassword;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        username = sc.nextLine();
        System.out.print("Enter password: ");
        password = sc.nextLine();

        if (username.equals("java") && password.equals("101")) {
            System.out.println("Logged in");
        } else {
            System.out.println("Wrong username or password! If you like to change your password press 1");
            temp = sc.nextInt();
            sc.nextLine();

            if (temp == 1) {
                System.out.print("Enter new password: ");
                newPassword = sc.nextLine();

                if (!newPassword.equals("java")) {
                    System.out.println("Password has been changed.");
                    System.out.print("Try logging in again.\nEnter username: ");
                    username = sc.nextLine();
                    System.out.print("Enter password: ");
                    password = sc.nextLine();

                    if (username.equals("101") && password.equals(newPassword)) {
                        System.out.println("You are logged in");
                    } else {
                        System.out.println("Login failed");
                    }
                }
            }
        }
    }
}
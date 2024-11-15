package com.mycompany.loginattempts;

import java.util.Scanner;
/**
 *
 * @author EskaRashid
 */
public class Loginattempts {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "admin";
        String password = "password";
        int attempts = 3;

        System.out.println("Welcome to the Console Login System!");

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Invalid username or password. " + attempts + " attempts left.");
                } else {
                    System.out.println("Too many unsuccessful attempts. Access denied.");
                }
            }
        }

        scanner.close();
    }
}
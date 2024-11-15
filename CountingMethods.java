/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.countingmethods;

/**
 *
 * @author EskaRashid
 */
public class CountingMethods {

   public static void main(String[] args) {
        // Calling the countFromOneToTen method
        countFromOneToTen();
        
        System.out.println(); // Print a blank line for separation
        
        // Calling the countFromTenToOne method
        countFromTenToOne();
    }

    // Method to count from one to ten
    public static void countFromOneToTen() {
        System.out.println("Counting from one to ten:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    // Method to count from ten to one
    public static void countFromTenToOne() {
        System.out.println("Counting from ten to one:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
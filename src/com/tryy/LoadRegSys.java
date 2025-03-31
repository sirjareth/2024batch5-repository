/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryy;

import java.util.Scanner;

public class LoadRegSys {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        displayPrompt();
        sc.close();
    }

    public static void displayPrompt() {

        System.out.println("===========================");
        System.out.println("     Load Registration     ");
        System.out.println("===========================");

        System.out.println("Select a promo: ");
        System.out.println("    [1] Text Only");
        System.out.println("    [2] Call Only");
        System.out.println("    [3] GoSurf");
        System.out.println("    [4] Exit");
        System.out.print("Enter a choice: ");



        byte promoChoice= sc.nextByte();
        switch (promoChoice) {
            case 1:
                unliTextPromo();
                break;
            case 2:
                unliCallPromo();
                break;
            case 3:
                break;
            case 4:
                return; // exit back to main
            case 5:
                System.out.println("Invalid choice!");
        }

    }

    public static void unliTextPromo() {

        System.out.println("\nEnjoy Unli Text Promo: ");
        System.out.println("    [1] 1 Day,  ₱10");
        System.out.println("    [2] 2 Days, ₱20");
        System.out.println("    [3] 5 Days, ₱50");
        System.out.println("    [4] 7 Days, ₱60");
        System.out.print("Enter a choice: ");
        byte textPromoChoiceDuration = sc.nextByte();

        String promoType = "Unli Text";
        switch (textPromoChoiceDuration) {
            case 1:
                // 1 Day
                confirmToSubscribe(1, promoType);
                break;
            case 2:
                // 2 Days
                confirmToSubscribe(2, promoType);
                break;
            case 3:
                // 5 Days
                confirmToSubscribe(5, promoType);
                break;
            case 4:
                // 7 Days
                confirmToSubscribe(7, promoType);
                break;
        }
    }

    public static void unliCallPromo() {

        System.out.println("\nEnjoy Unli Call Promo: ");
        System.out.println("    [1] 1 Day,  ₱20");
        System.out.println("    [2] 2 Days, ₱30");
        System.out.println("    [3] 5 Days, ₱60");
        System.out.println("    [4] 7 Days, ₱80");
        System.out.print("Enter a choice: ");
        byte callPromoChoiceDuration = sc.nextByte();

        String promoType = "Unli Call";
        switch (callPromoChoiceDuration) {
            case 1:
                // 1 Day
                confirmToSubscribe(1, promoType);
                break;
            case 2:
                // 2 Days
                confirmToSubscribe(2, promoType);
                break;
            case 3:
                // 5 Days
                confirmToSubscribe(5, promoType);
                break;
            case 4:
                // 7 Days
                confirmToSubscribe(7, promoType);
                break;
        }
    }

    public static void confirmToSubscribe(int callPromoChoiceDuration, String promoType) {

        System.out.println("\n  [1] Subscibe");
        System.out.println("  [2] Back    ");
        System.out.println("  [3] Exit    ");
        System.out.print("Enter a choice: ");
        byte choice = sc.nextByte();

        if (choice == 1) {
            System.out.println("\nCongratulations! You are now subscribe to "
                    + promoType + " for " + callPromoChoiceDuration + " Day(s)");
        } else if (choice == 2) {

        } else {
            System.out.println("*** Thank you ***");
            System.exit(0); // // Exits program immediately (JVM) 
        }
    }

}

//        // checking for valid byte input
//        byte promoChoice;
//        if (sc.hasNextByte()) {
//            promoChoice = sc.nextByte();
//            sc.nextLine();
//        } else {
//            System.out.println("Invalid input! Please enter a number.");
//            sc.nextLine(); // Consume invalid input
//            displayPrompt(); // Restart the prompt
//            return;
//        }
/*
    
*/

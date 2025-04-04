/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.load_reg;

import java.util.Scanner;

public class LoadRegSys {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
        sc.close();
        
    }

    
    public static void displayMainMenu() {
        System.out.println("===========================");
        System.out.println("     Load Registration     ");
        System.out.println("===========================");

        System.out.println("Select a promo: ");
        System.out.println("    [1] Text Only");
        System.out.println("    [2] Call Only");
        System.out.println("    [3] Call n Text");
        System.out.println("    [4] GoSurf");
        System.out.println("    [5] Exit");
        System.out.print("Enter a choice: ");
        byte promoChoice = sc.nextByte();
        sc.nextLine(); // consume excess ch
        switch (promoChoice) {
            case 1:
                unliTextPromo("Unli Text");
                break;
            case 2:
                unliCallPromo("Unli Call");
                break;
            case 3:
                //goSurfPromo
                break;
            case 4:
                exitProgram();
                break;
            default:
                System.out.println("Invalid Input. Press 1 - 5 only!");
                displayMainMenu();
        }
    }

    public static void unliTextPromo(String promoType) {
        System.out.println("\nEnjoy Unli Text Promo: ");
        System.out.println("    [1] 1 Day,  ₱10");
        System.out.println("    [2] 2 Days, ₱20");
        System.out.println("    [3] 5 Days, ₱50");
        System.out.println("    [4] 7 Days, ₱60");
        System.out.println("    [5] Back");
        System.out.println("    [6] Exit");
        System.out.print("Enter a choice: ");
        byte textPromoChoice = sc.nextByte();

        switch (textPromoChoice) {
            case 1:
                // 1 Day
                subscribe(1, promoType);
                break;
            case 2:
                // 2 Days
                subscribe(2, promoType);
                break;
            case 3:
                // 5 Days
                subscribe(5, promoType);
                break;
            case 4:
                // 7 Days
                subscribe(7, promoType);
                break;
            case 5:
                displayMainMenu();
                break;
            case 6:
                exitProgram();
                break;
        }
    }

    public static void unliCallPromo(String promoType) {
        System.out.println("\nEnjoy Unli Call Promo: ");
        System.out.println("    [1] 1 Day,  ₱20");
        System.out.println("    [2] 2 Days, ₱30");
        System.out.println("    [3] 5 Days, ₱60");
        System.out.println("    [4] 7 Days, ₱80");
        System.out.println("    [5] Back");
        System.out.println("    [6] Exit");
        System.out.print("Enter a choice: ");
        byte callPromoChoice = sc.nextByte();

        switch (callPromoChoice) {
            case 1:
                // 1 Day
                subscribe(1, promoType);
                break;
            case 2:
                // 2 Days
                subscribe(2, promoType);
                break;
            case 3:
                // 5 Days
                subscribe(5, promoType);
                break;
            case 4:
                // 7 Days
                subscribe(7, promoType);
                break;
        }
    }

    public static void subscribe(int promoDuration, String promoType) {
        System.out.println("\n  [1] Subsrcibe");
        System.out.println("  [2] Back    ");
        System.out.println("  [3] Exit    ");
        System.out.print("Enter a choice: ");
        byte choice = sc.nextByte();

        if (choice == 1) {
            System.out.println("\nCongratulations! You are now subscribe to "
                    + promoType + " for " + promoDuration + " Day(s)");
        } else if (choice == 2) {
            
        } else {
            System.out.println("*** Thank you ***");
        }
    }
    
    
    public static void exitProgram(){
        System.out.println("Are you sure you want to exit? \n\t[Y] Yes \n\t[N] No");
        System.out.println("Enter a choice: ");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            System.out.println("Exiting.....");
            System.exit(0); // Exit the program immediately (JVM)
            
        } else {
            System.out.println("Failed to Exit\n\n\n");
            displayMainMenu();
        }
    }

}

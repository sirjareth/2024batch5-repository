///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.load_reg;
//
//import java.util.Scanner;
//
//public class LoadRegSys {
//    
//    public static void main(String[] args) {
//        displayPrompt();
//    }
//
//    public static void displayPrompt() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("===========================");
//        System.out.println("     Load Registration     ");
//        System.out.println("===========================");
//
//        System.out.println("Select a promo: ");
//        System.out.println("    [1] Text Only");
//        System.out.println("    [2] Call Only");
//        System.out.println("    [3] GoSurf");
//        System.out.println("    [4] Exit");
//        System.out.print("Enter a choice: ");
//        byte promoChoice = sc.nextByte();
//
//        switch (promoChoice) {
//            case 1:
//                unliTextPromo("Unli Text");
//                break;
//            case 2:
//                unliCallPromo("Unli Call");
//                break;
//            // 
//        }
//
//        sc.close();
//
//    }
//
//    public static void unliTextPromo(String promo) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\nEnjoy Unli Text Promo: ");
//        System.out.println("    [1] 1 Day,  ₱10");
//        System.out.println("    [2] 2 Days, ₱20");
//        System.out.println("    [3] 5 Days, ₱50");
//        System.out.println("    [4] 7 Days, ₱60");
//        System.out.print("Enter a choice: ");
//        byte textPromoChoice = sc.nextByte();
//
//        switch (textPromoChoice) {
//            case 1: 
//                // 1 Day
//                subscribe(1, promo);
//                break;
//            case 2:
//                // 2 Days
//                subscribe(2, promo);
//                break;
//            case 3:
//                // 5 Days
//                subscribe(5, promo);
//                break;    
//            case 4:
//                // 7 Days
//                subscribe(7, promo);
//                break;    
//        }
//    }
//    
//    
//    public static void unliCallPromo(String promo) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\nEnjoy Unli Call Promo: ");
//        System.out.println("    [1] 1 Day,  ₱20");
//        System.out.println("    [2] 2 Days, ₱30");
//        System.out.println("    [3] 5 Days, ₱60");
//        System.out.println("    [4] 7 Days, ₱80");
//        System.out.print("Enter a choice: ");
//        byte textPromoChoice = sc.nextByte();
//
//        switch (textPromoChoice) {
//            case 1: 
//                // 1 Day
//                subscribe(1, promo);
//                break;
//            case 2:
//                // 2 Days
//                subscribe(2, promo);
//                break;
//            case 3:
//                // 5 Days
//                subscribe(5, promo);
//                break;    
//            case 4:
//                // 7 Days
//                subscribe(7, promo);
//                break;    
//        }
//    }
//    
//    
//
//    public static void subscribeToUnliText(int days, String promo) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\n  [1] Subscibe");
//        System.out.println("  [2] Back    ");
//        System.out.println("  [3] Exit    ");
//        System.out.print("Enter a choice: ");
//        byte choice = sc.nextByte();
//
//        if (choice == 1) {
//            System.out.println("\nCongratulations! You are now subscribe to "
//                    + "Unli Text for " + days + " Day(s)");
//        } else if (choice == 2) {
//            
//        } else {
//            System.out.println("*** Thank you ***");
//        } 
//    }
//
//}

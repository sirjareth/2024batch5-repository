package com.load_reg;

import java.util.Scanner;

public class LoadRegistrationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("     Load Registration     ");
        System.out.println("===========================");

        System.out.println("Select a promo: ");
        System.out.println("    [1] Text Only");
        System.out.println("    [2] Call Only");
        System.out.println("    [3] GoSurf");
        System.out.println("    [4] Exit");
        System.out.print("Enter a choice: ");
        byte choice = sc.nextByte();

        switch (choice) {

            case 1: // Text Only
                System.out.println("Enjoy Unli Text Promo: ");
                System.out.println("    [1] 1 Day,  ₱10");
                System.out.println("    [2] 2 Days, ₱20");
                System.out.println("    [3] 5 Days, ₱50");
                System.out.println("    [4] 7 Days, ₱60");
                System.out.print("Enter a choice: ");
                byte textPromoChoice = sc.nextByte();

                switch (textPromoChoice) {
                    case 1: // 1D
                        System.out.println("  [1] Subscibe");
                        System.out.println("  [2] Back    ");
                        System.out.println("  [3] Exit    ");
                        System.out.print("Enter a choice: ");
                        choice = sc.nextByte();

                        if (choice == 1) {
                            System.out.println("Congratulations! You are now "
                                    + "subscribe to Unli Text for 1 Day(s).");
                        } else if (choice == 2) {
                            // back function
                        } else {
                            System.out.println("*** Thank you ***");
                        }
                        break;
                    case 2: //2D
                        System.out.println("    [1] Subscibe");
                        System.out.println("    [2] Back    ");
                        System.out.println("    [3] Exit    ");
                        System.out.print("Enter a choice: ");
                        choice = sc.nextByte();

                        if (choice == 1) {
                            System.out.println("Congratulations! You are now "
                                    + "subscribe to Unli Text for 2 Day(s).");
                        } else if (choice == 2) {
                            // back function
                        } else {
                            System.out.println("*** Thank you ***");
                        }
                        break;
                    case 3: //3D
                        System.out.println("    [1] Subscibe");
                        System.out.println("    [2] Back    ");
                        System.out.println("    [3] Exit    ");
                        System.out.print("Enter a choice:   ");
                        choice = sc.nextByte();

                        if (choice == 1) {
                            System.out.println("Congratulations! You are now "
                                    + "subscribe to Unli Text for 5 Day(s).");
                        } else if (choice == 2) {
                            // back function
                        } else {
                            System.out.println("*** Thank you ***");
                        }
                        break;
                    case 4: //4
                        System.out.println("    [1] Subscibe");
                        System.out.println("    [2] Back    ");
                        System.out.println("    [3] Exit    ");
                        System.out.print("Enter a choice:   ");
                        choice = sc.nextByte();

                        if (choice == 1) {
                            System.out.println("Congratulations! You are now "
                                    + "subscribe to Unli Text for 7 Day(s).");
                        } else if (choice == 2) {
                            // back function
                        } else {
                            System.out.println("*** Thank you ***");
                        }
                        break;
                }
                break;
            case 2: // Call Only
                System.out.println("Enjoy Unli Call Promo: ");
                System.out.println("    [1] 1 Day,  ₱20 ");
                System.out.println("    [2] 2 Days, ₱40 ");
                System.out.println("    [3] 5 Days, ₱70 ");
                System.out.println("    [4] 7 Days, ₱100");
                System.out.print("Enter a choice: ");
                byte callPromoChoice = sc.nextByte();

                switch (callPromoChoice) {
                    case 1: // 1D
                        System.out.println("  [1] Subscibe");
                        System.out.println("  [2] Back    ");
                        System.out.println("  [3] Exit    ");
                        System.out.print("Enter a choice: ");
                        choice = sc.nextByte();

                        if (choice == 1) {
                            System.out.println("Congratulations! You are now "
                                    + "subscribe to Unli Call for 1 Day(s).");
                        } else if (choice == 2) {
                            // back function
                        } else {
                            System.out.println("*** Thank you ***");
                        }
                        break;
                    case 2: //2D
                        System.out.println("    [1] Subscibe");
                        System.out.println("    [2] Back    ");
                        System.out.println("    [3] Exit    ");
                        System.out.print("Enter a choice: ");
                        choice = sc.nextByte();

                        if (choice == 1) {
                            System.out.println("Congratulations! You are now "
                                    + "subscribe to Unli Call for 2 Day(s).");
                        } else if (choice == 2) {
                            // back function
                        } else {
                            System.out.println("*** Thank you ***");
                        }
                        break;
                    case 3: //3D
                        System.out.println("    [1] Subscibe");
                        System.out.println("    [2] Back    ");
                        System.out.println("    [3] Exit    ");
                        System.out.print("Enter a choice:   ");
                        choice = sc.nextByte();

                        if (choice == 1) {
                            System.out.println("Congratulations! You are now "
                                    + "subscribe to Unli Call for 5 Day(s).");
                        } else if (choice == 2) {
                            // back function
                        } else {
                            System.out.println("*** Thank you ***");
                        }
                        break;
                    case 4: //4
                        System.out.println("    [1] Subscibe");
                        System.out.println("    [2] Back    ");
                        System.out.println("    [3] Exit    ");
                        System.out.print("Enter a choice:   ");
                        choice = sc.nextByte();

                        if (choice == 1) {
                            System.out.println("Congratulations! You are now "
                                    + "subscribe to Unli Call for 7 Day(s).");
                        } else if (choice == 2) {
                            // back function
                        } else {
                            System.out.println("*** Thank you ***");
                        }
                        break;
                }
                break;
            case 3: //Go Surf
                System.out.println("    [1] 1 Day Unli Call, Text, 1GB Internet, ₱20  ");
                System.out.println("    [2] 2 Day Unli Call, Text, 2GB Internet, ₱40  ");
                System.out.println("    [3] 5 Day Unli Call, Text, 5GB Internet, ₱70  ");
                System.out.println("    [4] 7 Day Unli Call, Text, 7GB Internet, ₱100 ");
                System.out.print("Enter a choice: ");
                byte goPromoChoice = sc.nextByte();

                switch (goPromoChoice) {
                    case 1: // 1D
                        System.out.println("  [1] Subscibe");
                        System.out.println("  [2] Back    ");
                        System.out.println("  [3] Exit    ");
                        System.out.print("Enter a choice: ");
                        choice = sc.nextByte();

                        if (choice == 1) {
                            System.out.println("Congratulations! You are now "
                                    + "subscribe to Unli Text for 1 Day(s).");
                        } else if (choice == 2) {
                            // back function
                        } else {
                            System.out.println("*** Thank you ***");
                        }
                        break;
                    case 2: //2D
                        System.out.println("    [1] Subscibe");
                        System.out.println("    [2] Back    ");
                        System.out.println("    [3] Exit    ");
                        System.out.print("Enter a choice: ");
                        choice = sc.nextByte();

                        if (choice == 1) {
                            System.out.println("Congratulations! You are now "
                                    + "subscribe to Unli Text for 2 Day(s).");
                        } else if (choice == 2) {
                            // back function
                        } else {
                            System.out.println("*** Thank you ***");
                        }
                        break;
                    case 3: //3D
                        System.out.println("    [1] Subscibe");
                        System.out.println("    [2] Back    ");
                        System.out.println("    [3] Exit    ");
                        System.out.print("Enter a choice:   ");
                        choice = sc.nextByte();

                        if (choice == 1) {
                            System.out.println("Congratulations! You are now "
                                    + "subscribe to Unli Text for 5 Day(s).");
                        } else if (choice == 2) {
                            // back function
                        } else {
                            System.out.println("*** Thank you ***");
                        }
                        break;
                    case 4: //4
                        System.out.println("    [1] Subscibe");
                        System.out.println("    [2] Back    ");
                        System.out.println("    [3] Exit    ");
                        System.out.print("Enter a choice:   ");
                        choice = sc.nextByte();

                        if (choice == 1) {
                            System.out.println("Congratulations! You are now "
                                    + "subscribe to Unli Text for 7 Day(s).");
                        } else if (choice == 2) {
                            // back function
                        } else {
                            System.out.println("*** Thank you ***");
                        }
                        break;
                }
                break;
            case 4:
                System.out.println("*** Thank you. Come back again!");
                break;
            default:
                System.out.println("Invalid Input! Choose from options above.");
        }
    }
}
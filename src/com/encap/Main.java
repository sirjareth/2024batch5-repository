/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encap;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        userRegistration();
        
    }
    
    
    public static void userRegistration(){
        Scanner sc = new Scanner(System.in);
        User user1 = new User();
        System.out.println("*** User Registration System ***");
        user1.setId(2025001);
        System.out.print("Enter your first name: ");
        String fName = sc.nextLine();
        
        
        // Print all the data
        int id = user1.getId();
        System.out.println("ID: " + id);
        user1.setFirstName(fName);
        String firstName = user1.getFirstName();
        System.out.println("First Name: " + firstName);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exceptions;

import java.util.Scanner;


public class RegistrationSystem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    
    public static void validateAge(int age) throws AgeException{
        
        if(age < 18){
            throw new AgeException("Registration failed. User must be 18+");
        }
        System.out.println("User registered successfully!");
        // MainMenu
    }
    
    
    
}

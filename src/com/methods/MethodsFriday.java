/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.methods;




public class MethodsFriday {
    
    static void main(String[] args) {
        
        int num = 50;
        String word = "The sum of the two numbers is ";
        
        
//        System.out.println(word + sum(10, 20));
//        
//        System.out.print(sum(10, 20));
        
       
    }             
    
    public static void add(int a, int b){
        int sum = a + b;    
        System.out.println(sum);
    }
    
    // int salary
    // int tax
    
    
    
    public static double total(int a, int b){
        add(10, 20); // 30
        int total = a + b;
        return total; 
    }
    
    
    
    public static int sum(int a, int b){
        return a + b;
    }
    
    
    
    
    
    
    /* return type
        data type
        void
    */
    // return; //to immediate terminate the method
}





/*

    public static void main(String[] args) {
        greet("Jareth", 25); 
        
        
    }
    
    public static void greet(String name, int age){
        print("Hello my name is " + name);
        print("I am " + age + " years old.");
    }
    
    public static void print(String word){
        System.out.println(word);
    }


    // Print Winter 20 times 
   
    
    public static void main(String[] args) {
        
    }
    
    static void displayName(String name){
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " " + name);
        }
    }
    
    // method for tax calculator


    public static void main(String[] args) {
        sum(10, 20, "Sum");
    }
    
    // parameter / argument
    public static void sum(int a, int b, String word){
        System.out.println(word + " : " + (a + b));
    }
*/
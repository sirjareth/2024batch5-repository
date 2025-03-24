/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.methods;


public class NewClass {
    
    
    public static void main(String[] args) {
        System.out.println("The sum of the two numbers is " + printResult());
    }
    
    public static int printResult() {
        int answer = add(10,20);
        return answer;
    }

    public static int add(int a, int b) {
        int total = a + b;
        return total;
    }
    
    
}




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;


public class Main {
    
    public static void main(String[] args) {
        Sun sun = new Sun();
        System.out.println(sun.hasLight());
        
        Moon moon = new Moon();
        System.out.println(moon.hasLight());
        System.out.println(moon.hasCraters());
        
        
        Earth earth = new Earth();
        System.out.println(earth.hasLight());
        System.out.println(earth.hasCraters());
        System.out.println(earth.hasPeople());   
        
    }
}

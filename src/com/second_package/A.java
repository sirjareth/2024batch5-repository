/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.second_package;

import com.first_package.B;


// Password 
// default access modifier -> package-private access modifier

public class A extends B{

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.word);
        a.greet();
        
    }
}

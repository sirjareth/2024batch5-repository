/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polymorphism;


public class Numeric {
    // Priority in terms of numeric
    
    void sum(Integer a, Integer b){
        System.out.println("Integer sum is: " + (a + b));
    }
    void sum(float a, float b){
        System.out.println("Float sum is: " + (a + b));
    }
    void sum(double a, double b){
        System.out.println("Double sum is: " + (a + b));
    }
    // byte short int long float double Byte Short Integer Long Float Double
    public static void main(String[] args) {
        Numeric n = new Numeric();
        //n.sum(100, 100); 
        Float f = 100.0f;
        
        n.sum(100.0, 100.0); 
    }
    
    /*
        a. Integer sum is 200
        b. Float sum is 200.0
        c. Double sum is 200.0
    */
}


/*
// ilfd
    void x(long a){System.out.println("long");}
    void x(float a){System.out.println("float");}
    void x(int a){System.out.println("int");}
    void x(double a){System.out.println("double");}
    
    
    
    public static void main(String[] args) {
        Numeric obj = new Numeric();
        obj.x(1);
    }
*/

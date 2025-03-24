
package com.first_package;



public class C {
    
    public void tryToAccess(){
        B obj = new B();
        System.out.println(obj.word);
        obj.greet();
    }
}
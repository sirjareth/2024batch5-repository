/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.ArrayList;



public class ArrayOfCars {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.add(2, "Red");
        colors.set(1, "Black");
        
        colors.clear();
        System.out.println(colors);
    }
}


/*
    
        cars.add("Isuzu");
        cars.add("Ferrari");
        cars.add("Honda");
        cars.add(2, "Ford");
        
        System.out.println(cars.contains("Honda"));
        System.out.println(cars);
*/
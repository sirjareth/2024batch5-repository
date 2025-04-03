/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsThursday{

    public static void main(String[] args) {
        List<String> colors = new LinkedList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Green");
        colors.add("Pink");
        
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Green");
        colors.add("Pink");
        
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Green");
        colors.add("Pink");
        
        Collections.shuffle(colors);

        for (int i = 0; i < 3; i++) {
            System.out.println(colors.get(i));
        }
        
    }
}

//  colors.forEach(System.out::println);
        // Traversing an arraylist using for loop
//        for (int i = 0; i < colors.size(); i++) {
////            System.out.println(colors.get(i));
////        }

        // Traversing an arraylist using for each loop
//        for (String color : colors) {
//            System.out.println(color);
//        }

/*
    Collections.sort(colors); // asc
        Collections.reverse(colors); // desc
*/


/*
    
        cars.add("Isuzu");
        cars.add("Ferrari");
        cars.add("Honda");
        cars.add(2, "Ford");
        
        System.out.println(cars.contains("Honda"));
        System.out.println(cars);
*/

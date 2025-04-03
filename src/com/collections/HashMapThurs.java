/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.HashMap;
import java.util.Map;


public class HashMapThurs {
    
    public static void main(String[] args) {
        // key value pairs
        Map<Integer, String> numberMapping = new HashMap<>();
        
        numberMapping.put(1, "One");
        numberMapping.put(2, "Two");
        numberMapping.put(3, "Three");
        System.out.println(numberMapping);
        
        System.out.println(numberMapping.isEmpty());
        System.out.println(numberMapping.size());
        
        System.out.println(numberMapping.containsKey(5));    
        System.out.println(numberMapping.containsValue("Three"));
        
        System.out.println(numberMapping.get(2));
        numberMapping.remove(3);
        
        System.out.println(numberMapping);
    }
}

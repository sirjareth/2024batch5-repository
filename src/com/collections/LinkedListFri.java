/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.LinkedList;
import java.util.List;


public class LinkedListFri {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Green");
        colors.add("Pink");
        colors.addFirst("Black");
        colors.addLast("Black");
        colors.removeFirst();
        colors.removeLast();
        System.out.println(colors.getFirst());
        System.out.println(colors.getLast());
        colors.forEach(System.out::println);
    }
}

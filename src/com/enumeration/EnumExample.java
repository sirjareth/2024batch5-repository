/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enumeration;

import java.util.Scanner;

class EnumExample {

    public enum Day {
        SUNDAY
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day: (1-7)");
        int day = sc.nextInt();
        String result;
        
        switch(day){
            case 1: 
                System.out.println(Day.SUNDAY);
                break;
            case 2:
                
        }
    }

}

/*
    for (Season s : Season.values()) {
            System.out.println(s);
        }


        System.out.print("Enter a month: ");
        int months = sc.nextInt();
        
        if (months <= 3) {
            System.out.println(Season.WINTER);
        } else if(months <= 6){
            System.out.println(Season.SPRING);
        } else if(months <=9 ){
            System.out.println(Season.SUMMER);
        } else if(months <= 12){
            System.out.println(Season.FALL);
        } else {
            System.out.println("Invalid Input!");
        }


        SUPERADMIN, ADMIN, USER
*/
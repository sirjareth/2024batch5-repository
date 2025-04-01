/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exceptions;



public class TryCatchDemo {

    public static void main(String[] args) {
        int i = 10;
        int j = 1;
        String x = "10x";
        int[] numbers = new int[5];
        
        try {
            int result = i / j;
            System.out.println(result);
            //System.out.println(numbers[5]);
            Integer.parseInt(x);
        } catch (ArithmeticException e) {
            System.out.println("Divided by zero : " + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Your are going out of bounds : " + e.getMessage());
        } catch(Exception e){
            System.out.println("Something went wrong! " + e.getMessage());
        }
    }

}


/*
    String str = "10x";
    try {
            int number = Integer.parseInt(str);
            System.out.println(number);
        } catch (Exception e) {
            System.out.println(e);       
        }

        System.out.println("Hello Java");
 */


/*
    public static void main(String[] args) {
        input();
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid number: ");
        

        try {
            int number = sc.nextInt();
            System.out.println("Your number is " + number);
        } catch (Exception e) {
            System.out.println(" " + e.getMessage());
            input(); // recursion
        }

    }
*/

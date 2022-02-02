
package com.mycompany.testfileio;

import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        System.out.println("abc");
        Scanner keyboard = new Scanner(System.in);
        
        String s = keyboard.nextLine();
        
        System.out.println("The user typed in : ");
        System.out.println(s);
    }
}

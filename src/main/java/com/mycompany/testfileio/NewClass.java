
package com.mycompany.testfileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("abc");
//        Scanner keyboard = new Scanner(System.in);
        FileReader fr = new FileReader("Input.txt");
        Scanner inFile = new Scanner(fr);
        while(inFile.hasNext()){
        String f = inFile.nextLine();
        System.out.println("The file's next line is: ");
        System.out.println(f);
        }
        
        
        
//        String s = keyboard.nextLine();
//        System.out.println("The user typed in : ");
//        System.out.println(s);
    }
}

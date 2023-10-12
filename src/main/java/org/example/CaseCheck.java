package org.example;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word to find if it is uppercase or lowercase : ");

        char ch = in.next().trim().charAt(0);

        if( ch >='a' && ch <='z'){
            System.out.print("LowerCase");
        } else if ((ch >='A' && ch <='Z')) {
            System.out.print("Upper Case");
        }
    }



}

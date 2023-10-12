package org.example;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Print 1 to 5
//        for(int n =1; n < 6; n++){
//
//            System.out.println(n);

        // Print 1 to n(by user)

        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = in.nextInt();
//        int g = 1;
//        while (g <= n){
//
//            System.out.println(g);
//            g++;

        // Print 1 to n(by user) by do while

        int g = 1;
        do {
            System.out.print(g + " ");
            g++;
        }while (g<=n);
    }
}

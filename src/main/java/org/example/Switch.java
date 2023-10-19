package org.example;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String Fruit = in.next();

        switch (Fruit) {

            case "Mango":
                System.out.println("Nice Fruit");
                break;
            case "Apple":
                System.out.println("Keeps the Doctor away");
                break;
            case "Lichi":
                System.out.println("Ant's favourite");
                break;
            default:
                System.out.println("Enter some fruit");
        }
    }
}

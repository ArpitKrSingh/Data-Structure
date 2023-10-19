package org.example;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int EmpID = in.nextInt();
        String Domain = in.next();

        switch (EmpID){
            case 1:
                System.out.println("great guy");
                break;
            case 2:
                System.out.println("Better guy");
            case 3:
                System.out.println("Choose the domain too");
                switch (Domain){
                    case "Web":
                        System.out.println("120K salary");
                        break;
                    case "cybersecurity":
                        System.out.println("122K salary");
                        break;
                    default:
                        System.out.println("Useless guy");
                }
                break;
            default:
                System.out.println("Enter some valid ID");
        }
    }
}

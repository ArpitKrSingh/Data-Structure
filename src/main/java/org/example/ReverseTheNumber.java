package org.example;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {


        // Reverse the number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse ");
        int n = in.nextInt();

        int ans = 0;

        while(n>0){

            int mod = n % 10;
            n = n / 10;

            ans = ans * 10 + mod;
        }
        System.out.println("The reverse of the number will be " + ans);

    }
}

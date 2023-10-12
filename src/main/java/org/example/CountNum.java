package org.example;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Find how many times 5 used in the number

        int n = in.nextInt();

        int count = 0;

        while (n > 0) {

            int rem = n % 10;

            if (rem == 5) {
                count++;
            }

            n = n / 10;    // Dividing n by 10 so that it can reach to 0
        }
        System.out.println(count);
    }
}
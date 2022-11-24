package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);

        int userCount = 1;
        int sum = 0;

        while (userCount <= 10) {
            System.out.println("enter number " + userCount);
            if (numberScanner.hasNextInt()) {
                int number = numberScanner.nextInt();
                numberScanner.nextLine();
                userCount++;
                sum += number;
            } else {
                System.out.println("that ain't an int");
                break;
            }
        } numberScanner.close();
        System.out.println("sum of entered numbers is " + sum);

    }
}

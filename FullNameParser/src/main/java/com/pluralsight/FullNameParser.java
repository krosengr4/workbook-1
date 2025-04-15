package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your full name formatted \"First Middle Last\": ");
        String fullName = myScanner.nextLine();

        String[] nameParts = fullName.split(" ");

        System.out.println("First name: " + nameParts[0]);
        System.out.println("Middle name: " + nameParts[1]);
        System.out.println("Last name: " + nameParts[2]);

    }

}

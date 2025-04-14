package com.pluralsight;

import java.util.Scanner;

public class PayrollCalc {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("What is your name?: ");
        String name = myScanner.next();

        System.out.print("How many hours have you worked?: ");
        float hoursWorked = myScanner.nextFloat();

        System.out.print("What is your pay rate?: ");
        float payRate = myScanner.nextFloat();

        float grossPay = hoursWorked * payRate;

        System.out.println("Your name is: " + name + " and your gross pay is: $" + grossPay);
    }

}

package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {


    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please chose your first number: " );
        float num1 = myScanner.nextInt();

        System.out.println("Please chose your second number: ");
        float num2 = myScanner.nextInt();

        System.out.println("Please chose a math operator ('A' for addition, 'S' for subtraction, 'M' for multiplication, or 'D' for division: ");
        String mathOperator = myScanner.next().toLowerCase();

        float result;

        if (mathOperator.equals("a")) {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (mathOperator.equals("s")) {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (mathOperator.equals("m")) {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (mathOperator.equals("d")) {
            if(num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Cannot divide by 0.");
        }
    } else {
            System.out.println("Error: invalid operation.");
        }
}}

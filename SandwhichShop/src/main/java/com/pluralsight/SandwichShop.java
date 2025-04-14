package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to the Sandwich Shop!");

        System.out.println("What do you want as the size of your sandwich? Input 1 for regular, Input 2 for large.: ");
        int sandwichSize = myScanner.nextInt();

        System.out.println("Please print your age: ");
        int age = myScanner.nextInt();

        double price = 0;
        double discount = 0;
        double totalPrice;

        if (sandwichSize == 1) {
            price += 5.45;
        } else if (sandwichSize == 2) {
            price += 8.95;
        } else {
            System.out.println("Error: Invalid response. Please select either 1 or 2 for sandwich size.");
        }
        System.out.println("The initial price for the sandwich is: $" + price);


        if (age <= 17) {
            discount += .10;
        } else if (age >= 65) {
            discount += .20;
        } else {
            discount = 0.00;
        }
        System.out.println("Your discount is: " + discount);

        totalPrice = price - (price * discount);
        System.out.println("The total price of your sandwich is: $" + totalPrice);

    }

}

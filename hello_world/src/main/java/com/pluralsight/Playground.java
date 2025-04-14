package com.pluralsight;

//
import java.util.Scanner;

// in a class we have methods and fields (or variables)
public class Playground {

    public static void main(String[] args) {

        printHello();
        PG();
        printPG();
        printPG2();
        scanner();
        scanner2();
    }


    static void printHello () {
        System.out.println("Hello world!");
//    System.out.println( j +  pi);
    }

    static void PG() {

        int total1 = 2 + 3 * 8;
        int total2 = (2+3) * 8;
        System.out.println("total1: " + total1);
        System.out.println("total2: " + total2);

        double min = Math.min(total2, total1);
        System.out.println("Min: "+ min);

        String name = " ";
        name = "Kev" + "in";
        System.out.println(name);
    }

    static void printPG () {
        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239.77f;
//        System.out.printf("%s (id: %d) $%.2f", name, id, pay);
        System.out.printf("Your name is: " + name+ "%n");


//        System.out.println();
        System.out.println("hello");
        System.out.println("world");
    }

    static void printPG2() {
        double x = 3.3333333;
        System.out.printf("This is a new print method: %.4f", x);
        System.out.println();
    }

    static void scanner() {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();


        System.out.print("Enter your age: ");
        int age = myScanner.nextInt();

        System.out.print("What is your favorite sport? : ");
        String favSport = myScanner.next();

        System.out.print("You are " + name + " ");
        System.out.print("and you're " + age + " years old! ");
        System.out.print("Your favorite sport is " + favSport + "!");
        System.out.println();
    }

    static void scanner2() {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = myScanner.nextInt();

        if (age > 40) {
            System.out.println("Jeez you're " + age + "?! That's old!!!");
        }
        else {
            System.out.println("You're still a youngin.");
        }
    }

    static void calculator() {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        System.out.print("What is the first number? ");


    }

}

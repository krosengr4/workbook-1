package com.pluralsight;

import java.util.Scanner;

public class StringLoopsAndArrays {

    public static void main(String[] args) {

//        formatString();
//        printNameAndLength("Kevin");
//        printNameAndLength("Alexander");//<--- printNameAndLength method takes in a string parameter
        stringSplitting();

    }

    static void formatString() {

        // use escape character(\) if you want quotes in the string.
        System.out.println("You put a string literal in quotes like this \"s\" ");

        // use \n to print things on a new line
        System.out.println("\nsome stuff");
        System.out.println("\nsome other stuff");

        // use \t to tab the line
        System.out.println("\tthis message is tabbed");
    }

    // practice with parameters and instance methods
    static void printNameAndLength(String i) { //<--- this method takes in parameter of i which is a string
        System.out.println("Name is: " + i);
        System.out.println("name length is: " + i.length()); //<--- .length is a instance method. (not Static)
        System.out.println("The second letter of the name is: " + i.charAt(1)); //<--- charAt() is 0 indexed
    }

    static void stringSplitting() {
        String name = "Kevin Rosengren";

        String[] nameParts = name.split(" "); ///<--- Use the .split to split Strings

        System.out.println("First name: " + nameParts[0]);
        System.out.println("Last name: " + nameParts[1]);

        String name2 = "Jamie|Benn";

        String[] nameParts2 = name2.split("\\|");

        System.out.println("First name: " + nameParts2[0]);
        System.out.println("Last name: " + nameParts2[1]);

    }

}

package com.pluralsight;

public class Conditionals {

    public static void main(String[] args) {

        Conditionals.ifElseStatement();
        Conditionals.ternaryOp();
        Conditionals.switchStatement();
    }

    static void ifElseStatement() {
        String response = "add";

        if (response.equals("add")) { // <--- use .equals() when comparing strings
            System.out.println("1 We're fixin' to add some things!");
        } else {
            System.out.println("We're mot adding");
        }
    }


    static void ternaryOp () {
        String response = "add";

        // a ternary operator is another way to use if else
        // variable = (condition) ? (expressionTrue) : (expressionFalse);
        String result = (response.equals("add")) ?  ("2 We are gonna add") : ("We're mot adding");
        System.out.println(result);
    }

    // switch statements
    static void switchStatement() {
        String response = "divide";

        switch (response) {
            case "add":
                System.out.println("We are adding");
                break; // <--- must add the break
            case "subtract":
                System.out.println("We are subtracting");
                break;
            case "divide":
                System.out.println("We are dividing");
                break;
            case "multiply":
                System.out.println("We are multiplying");
                break;
            default: // <--- Usually use the default to identify errors.
                System.out.println("Error: invalid selection");
        }
    }
}

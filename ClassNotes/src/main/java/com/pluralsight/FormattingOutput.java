package com.pluralsight;

public class FormattingOutput {

    public static void main(String[] args) {


        double price = 22.87;
        double tax = price * 0.0825;
        double totalDue = price + tax;

        //One method is using String.format()
        System.out.println("Total due is: " + String.format("%.2f", totalDue)); //<--- %.2f prints 2 digits after the decimal
        //Another method is to use printf() instead of println()
        System.out.printf("Total due is: " + "%.2f \n", totalDue);

        //Calling methods
        formatSpecifiers();
    }

    private static void formatSpecifiers() {
        /*
        Format specifiers begin with "%"
        They end with the data type of data being formatted (int, float, etc.)
        You can specify width and precision in between
        "d": decimal integer(base 10 number)
        "x or X": hexadecimal integer(base 16)
        "f": floating point number
        "s": string
        "c": character
         */
        //* Syntax: [flags] [width] [.precision] type-character

        String name = "Kevin";
        int id = 21884;
        double pay = 32.99;

        System.out.printf("Name: %s \nid: %d \nAmount due: $%.2f", name, id, pay);
    }
}

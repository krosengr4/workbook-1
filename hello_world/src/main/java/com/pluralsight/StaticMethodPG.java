package com.pluralsight;

public class StaticMethodPG {

    public static void main(String[] args) {

        int result = StaticMethodPG.myMethod();

        System.out.println("Return from myMethod(): " + result);

    }

    // methods called with: name (myMethod), return type (int) and parameters (none in here)
    static int myMethod() { // <--- instead of "void" you can put other values you want it to return

        String nine = "9";
        int i;
        // parse the String nine as an Integer
        i = Integer.parseInt(nine);

        return i;
    }

}

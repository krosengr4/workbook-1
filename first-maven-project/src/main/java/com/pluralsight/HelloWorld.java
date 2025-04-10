package com.pluralsight;


public class HelloWorld {


    public static void main(String[] args) {

//        HelloWorld helloWorld = new HelloWorld();

        System.out.println("Hello World");

        String name = "Kevin";
        System.out.println("Hello " + name);

        Person person1 = new Person("Kevin", 24, 183);

        saysHi();
        
    }

    public static void saysHi() {
        System.out.println("hi");
    }

}



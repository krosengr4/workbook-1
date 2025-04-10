package com.pluralsight;

public class Main {

//int i;
//static int x = 1;

//static double pi = 3.14;


    public static void main(String[] args) {

        int i = 2;
        int j = 3;

        int sum = i + j;
        System.out.println("Sum: " + sum);

        double x = 1.5;
        double y = 2.5;

        int age = 94;
        int currentYear = 2025;

        double gradePointAverage = 3.0;

        boolean isWeekend = false;

        String fullName = "Kevin Andrew Rosengren";

        char letterGrade = 'B';

        printHello();
        playGround();
    }


static void printHello () {
    System.out.println("Hello world!");
//    System.out.println( j +  pi);
}

static void playGround() {

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

}

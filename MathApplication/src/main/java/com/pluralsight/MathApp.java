package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

        higherSalary();
        cheapestCar();
        areaOfCircle();
        squareRoot();
        distanceBetweenPoints();
        absoluteValue();
        randNumber();
    }


    static void higherSalary() {

        // Question 1:
    // declare variables here
        double bobSalary = 50000;
        double garySalary = 200000.99;

    // then code solution
        double highestSalary = Math.max(bobSalary, garySalary);

    // then use System.out.println() to display results
        System.out.println("The highest salary is: " + highestSalary);
    }


    // Find and display the smallest of two variables named carPrice and
    // truckPrice. Set the variables to any value you want.
    static void cheapestCar () {
        double carPrice = 15000;
        double truckPrice = 17283;
        double cheapestVehicle = Math.min(carPrice, truckPrice);

        System.out.println("The cheapest vehicle cost: $" + cheapestVehicle);
    }


    // Find and display the area of a circle whose radius is 7.25
    static void areaOfCircle () {
        double pi = Math.PI;
        double radius = 7.25;

        double circleArea = pi * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + circleArea);
    }


    // Find and display the square root a variable after it is set to 5.0
    static void squareRoot () {
        double x = 5.0;
        double result = Math.sqrt(x);
        System.out.println("The square root is: " + result);
    }


    // Find and display the distance between the points (5, 10) and (85, 50)
    static void distanceBetweenPoints() {

        int firstX = 5;
        int secondX = 85;
        int firstY = 10;
        int secondY = 50;
        // d = √((x2 - x1)² + (y2 - y1)²)

        double result = Math.sqrt( Math.pow((secondX - firstX), 2) + Math.pow((secondY - firstY), 2));
        System.out.println("The distance between the 2 points is: " + result);

    }


    // Find and display the absolute (positive) value of a variable after it is set to -3.8
    static void absoluteValue() {
        double y = -3.8;
        double result = Math.abs(y);

        System.out.println(result);
    }


    // Find and display a random number between 0 and 1
    static void randNumber() {
//        double z = 0;
        double randResult = Math.random();
        System.out.println("Your random number is: " + randResult);
    }
}

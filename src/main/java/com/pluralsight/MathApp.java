package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 67854.98;
        double garySalary = 79856.56;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: "+highestSalary);
        //Salaries for both Bob and Gary were defined and compared.
        //Printed is the highest Salary of both employees

        double carPrice = 21799.99;
        double truckPrice = 54687.99;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is: "+lowestPrice);
        // Prices for both Car and Truck were defined and compared.
        //Printed is the lowest price of both car and truck.

        double radius_of_circle = 7.25;
        double pi = 3.14159265359;
        double area_of_circle = Math.PI*(radius_of_circle*radius_of_circle);
        System.out.println("The area of the circle is: "+area_of_circle);
        //The radius of the circle and pi were defined.
        //Printed is the area of a circle using math function Math.pi()

        double initial_number = 5.0;
        double square_root = Math.sqrt(initial_number);
        System.out.println("The square root of "+initial_number+" is "+square_root);
        //Given an initial number, square root was calculated using math function Math.sqrt()

        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        // The point (5,10) and (85,50) have been defined
        // Find the mid-point of the 2 points
        double distance_between_points = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("The distance between points (5,10) and (85,50) is : "+distance_between_points);
        //Printed is the distance between (5,10) and (85,50)

        double initial_neg_number = -3.8;
        double absolute_value = Math.abs(initial_neg_number);
        System.out.println("The absolute value of "+initial_neg_number+ " is "+absolute_value);
        //The math function Math.abs() was used to find the absolute value of the given number


        double random_number = Math.random();
        System.out.println("A random number between 0 and 1 is: "+random_number);
        //Math function Math.random() is used to find random numbers between 0 and 1

        int days = 24;
        int minutes_per_day = 1440;
        int seconds_per_day = 86400;
        int minutes_in_24_days = days*minutes_per_day;
        System.out.println("24 days have "+minutes_in_24_days+" minutes.");
        int milliseconds_in_24_days = days*seconds_per_day*1000;
        System.out.println("24 days have "+milliseconds_in_24_days+" milliseconds.");
        //Days, minutes and seconds are defined and used to calculate the total number of minutes and milliseconds in a day


    }
}

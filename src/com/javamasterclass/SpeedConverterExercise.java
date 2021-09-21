package com.javamasterclass;

public class SpeedConverterExercise {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
        System.out.println(toMilesPerHour(100.4));
//
//        printConversion(1.5);
//        printConversion();
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        double kph = 1.609d;
        System.out.println("KPH = " +kilometersPerHour);

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            kilometersPerHour = kilometersPerHour / kph;
            System.out.println(kilometersPerHour );
        }

        return Math.round(kilometersPerHour);
    }

    public static void printConversion(double kilometersPerHour){
        double kph = 1.609d;

        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + (Math.round(kilometersPerHour / kph)) + " mi/h");
        }
    }
}

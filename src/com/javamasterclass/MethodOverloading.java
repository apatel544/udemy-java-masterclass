package com.javamasterclass;

public class MethodOverloading {

    public static void main(String[] args) {
//        int newScore = calculateScore("Ankur", 1);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
        System.out.println(calcFeetAndInchesToCentimeters(1,9));
        System.out.println(calcFeetAndInchesToCentimeters(2,0));
        System.out.println(calcFeetAndInchesToCentimeters(1,13));
        System.out.println(calcFeetAndInchesToCentimeters(-1, 2));
        System.out.println(calcFeetAndInchesToCentimeters(175));
        System.out.println(calcFeetAndInchesToCentimeters(-24));
    }
//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points.");
//        return score * 1000;
//    }
//    public static int calculateScore(int score) {
//        System.out.println("Player scored " + score + " points.");
//        return score * 1000;
//    }
//    public static int calculateScore() {
//        System.out.println("No player name and no one scored");
//        return 0;
//    }

    //Coding Challenge 1
    //original method for calculation.
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double c = 2.54;
        if(feet >= 0) {
            if(inches >= 0 && inches <= 12) {
                double feetToInches = feet * 12;
                double centimeter = (inches + feetToInches) * c;
//                int a = (int)inchesToCentimeter;
                System.out.println("There are " + centimeter + " centimeters in " + feet + " feet and " + inches + " inches.");
                return centimeter;
            }
        }
            return -1;
    }
    //This is an overloaded method using the same method name but diff params
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println("There are " + feet + " feet and " + remainingInches + " inches " + inches + " inches.");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }
}

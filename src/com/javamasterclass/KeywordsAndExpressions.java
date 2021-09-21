package com.javamasterclass;

public class KeywordsAndExpressions {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344); // everything after double(or data type) is an expression
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        int score = 100; // expression: score = 100
        if (score > 99) { // expression: score > 99
            System.out.println("You got the high score!"); // expression: "You got the high score!" => anything inside of a ()
            score = 0; // expression: score = 0
        }
    }
}

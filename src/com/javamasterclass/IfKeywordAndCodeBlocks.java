package com.javamasterclass;

public class IfKeywordAndCodeBlocks {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) { // codeblocks are used to organize code and make them encapsulated.
//            System.out.println("Your score was less that 5000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here!");
//        }

        if (gameOver == true) {
            //if a variable is created INSIDE a code block {}, you cannot access finalScore outside the code block
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=1000;
            System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (score == 10000) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


    }
}

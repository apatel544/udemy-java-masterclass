package com.javamasterclass;

public class Methods {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, 5000, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        //Methods Challenge 1
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Serena", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Ankur", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bhavika", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Sagar", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("kesha", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            //if a variable is created INSIDE a code block {}, you cannot access finalScore outside the code block
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + ", you have reached the position: " + position + " on the leaderboards!");
    }

    public static int calculateHighScorePosition(int playerScore) {
        // when testing ranges ensure you are also including the value you are testing against
        // example score > 1000 does NOT include 1000, using >= will include 1000 and above!
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;

        // Implementing above code but only using ONE return statement
        int position = 4; // assumming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100); {
            position = 3;
        }

        return position;
    }

}

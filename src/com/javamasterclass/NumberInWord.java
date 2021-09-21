package com.javamasterclass;

public class NumberInWord {

    public static void main(String[] args) {
        printNumberInWord(-1);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);
    }

    public static void printNumberInWord(int number) {
        String numToWord = "OTHER";
        if (number == 0) {
            numToWord = "ZERO";
        } else if (number == 1) {
            numToWord = "ONE";
        } else if (number == 2) {
            numToWord = "TWO";
        } else if (number == 3) {
            numToWord = "THREE";
        } else if (number == 4) {
            numToWord = "FOUR";
        } else if (number == 5) {
            numToWord = "FIVE";
        } else if (number == 6) {
            numToWord = "SIX";
        } else if (number == 7) {
            numToWord = "SEVEN";
        } else if (number == 8) {
            numToWord = "EIGHT";
        } else if (number == 9) {
            numToWord = "NINE";
        }
        System.out.println(numToWord);
    }
}

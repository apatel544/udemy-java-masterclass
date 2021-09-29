package com.javamasterclass;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(7078));
//        System.out.println(isPalindrome(1100011));
//        System.out.println(isPalindrome(-1100011));

    }

    // method to check if number passed is a palindrome
    public static boolean isPalindrome(int number) {
        // initialized variables
        boolean validPalindrome = false;
        int reversedNum = 0;
        int lastDigit;
        int forwardNum = number;
        // While Loop to reverse the number
        while (number != 0) {
            lastDigit = number % 10;
            System.out.println("lastDigit " + lastDigit);
            reversedNum = (reversedNum*10) + lastDigit ;
            number /= 10;
            System.out.println(reversedNum);
        }
        // compares original number and reversed number to see if a
        // palindrome is found
        if (forwardNum == reversedNum) {
            validPalindrome = true;
        }
        return validPalindrome;
        }
    }

package com.javamasterclass;

public class DigitSumChallenge {
    public static void main(String[] args) {
        //Print statements to invoke the method sumDigits
        System.out.println("The sum of the digits in number 123 is " + sumDigits(123));
        System.out.println("The sum of the digits in number -123 is " + sumDigits(-123));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 1500 is " + sumDigits(1500));
    }

    // sumDigits method
    // calculate the sum of all the digits in a number greater than 10
    // ex: 123; 1 + 2 + 3 = 6
    public static int sumDigits(int number) {
        // initialize variables
        int sum = 0;
        int num = 0;
        // if statement to return -1 if numbers are between 0-9
        if(number < 10) {
            return -1;
        }
        // while loop to perform math to sum all digits in a number greater than 10
        while (number > 0) {
                num = number % 10; // num = 3
                number /= 10; // n = 12
                sum += num;
        }

        // return the sum of the digits or -1 if not a valid digit
        return sum;
    }
}

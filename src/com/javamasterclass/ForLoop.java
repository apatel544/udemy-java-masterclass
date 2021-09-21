package com.javamasterclass;

public class ForLoop {

    public static void main(String[] args) {
        // write your code here
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0,3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0,4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0,5.0));

//        for (int i = 2; i < 9; i++) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//        }
//        System.out.println("****************************");
//
//        for (int i = 8; i >= 2; i--) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//        }
        int counter = 0;
        for (int i = 0; i < 10; i++) {

            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                counter++;
            }
            if(counter == 3) {
                System.out.println("We have found " + counter + " prime numbers.");
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}

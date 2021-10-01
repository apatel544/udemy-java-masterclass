package com.javamasterclass;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252)); //return 4;
        System.out.println(sumFirstAndLastDigit(257)); //return 9
        System.out.println(sumFirstAndLastDigit(11)); //return 0
        System.out.println(sumFirstAndLastDigit(5)); //return 10
        System.out.println(sumFirstAndLastDigit(-10)); //return -1
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int last = number % 10;
        while (number > 9) {
            number /= 10;
        }
        return  number + last;
    }
}

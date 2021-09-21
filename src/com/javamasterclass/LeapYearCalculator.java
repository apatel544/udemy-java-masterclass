package com.javamasterclass;

public class LeapYearCalculator {

    public static void main(String[] args) {
    // invoking the function isLeapYear and printing return
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1924));//true
        System.out.println(isLeapYear(1855));//false
    }

    public static boolean isLeapYear(int year) {
        // initializes return to false while checking cases
        boolean temp = false;
        //calculations to determine if the year is a leap year
        // leap years are divisible by 4, 100 and 400.
        int div4 = year % 4;
        int div100 = year % 100;
        int div400 = year % 400;
        // if statement to check if year is valid
        if (year >= 1 && year <= 9999) {
            // checks if all calculations return no remainder
            if((div4 == 0) && (div100 == 0) && (div400 == 0)) {
                temp = true;
            } else if(div4 == 0 && div100 != 0) { //if div100 != 0 but div4 == 0, then return true because technically still a leap year
                temp = true;
            } else if(div4 != 0 && div100 == 0) { //if div4 != 0 but div100 == 0, then return true because technically still a leap year
                temp = true;
            }
        }
        return temp;
    }
}

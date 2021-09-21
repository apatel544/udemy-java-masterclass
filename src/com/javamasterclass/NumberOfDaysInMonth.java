package com.javamasterclass;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear = true;
        int div4 = year % 4;
        int div100 = year % 100;
        int div400 = year % 400;

       if (year < 1 || year > 9999){
           leapYear = false;
       } else if ((year > 1 && year < 9999) && (div4 == 0) && (div100 != 0) || (div400 == 0)){
           leapYear = true;
       }
       return leapYear;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                return 31;
            }
            case 4: case 6: case 9: case 11: {
                return 30;
            }
            case 2: {
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            }
        }
        return -1;
    }
}

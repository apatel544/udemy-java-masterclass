package com.javamasterclass;

public class TeenNumberChecker {

    public static void main(String[] args) {
        //invoke and print hasTeen
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));

        //invoke and print isTeen
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int a, int b, int c) {
        return ((a <= 19 && a >= 13) || (b <= 19 && b >= 13) || (c <= 19 && c >= 13));
    }

    public static boolean isTeen(int d) {
        return (d <= 19 && d >= 13);
    }
}

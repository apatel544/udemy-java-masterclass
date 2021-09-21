package com.javamasterclass;

public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1)); //return false, expected sum is 2 but is given 1.
        System.out.println(hasEqualSum(1, 1, 2)); //return true
        System.out.println(hasEqualSum(1, -1, 0)); // return true

    }

    public static boolean hasEqualSum(int num1, int num2, int num3){

        int sum = num1 + num2;

//        if(sum == num3){
//            return true;
//        } else {
//            return false;
//        }

        //simplified return for IF statement above
        return sum == num3;

    }
}

package com.javamasterclass;

public class BarkingDog {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

    }

    public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
        boolean temp = false;

        if(barking && (hourOfDay < 8  && hourOfDay >= 0)){
            temp = true;
        } else if (barking && (hourOfDay == 23)){
            temp = true;
        }
        return temp;
    }
}

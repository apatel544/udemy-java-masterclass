package com.javamasterclass;

public class SecondAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(120,50));
        System.out.println(getDurationString(90,23));
        System.out.println(getDurationString(1000));
        System.out.println(getDurationString(3600));
    }

    public static String getDurationString(int minutes, int seconds){

        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid Value";
        }
        int hours = minutes / 60;
        int remainderMins = minutes % 60;

        return hours + "h " + remainderMins + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) {
            return "Invalid value";
        }

        int mins = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(mins,remainingSeconds);
    }
}

package com.javamasterclass;

public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(true,35));

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean playing = false;
        if (summer && (temperature > 25 && temperature <= 45)) {
            playing = true;
        } else if (!summer && (temperature > 25 && temperature <=35)){
            playing = true;
        }
        return playing;
    }

}

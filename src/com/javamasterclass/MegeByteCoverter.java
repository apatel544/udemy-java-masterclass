package com.javamasterclass;

public class MegeByteCoverter {

    public static void main(String[] args) {
    /*
    1 MB = 1024 KB
     */
    printMegaBytesAndKiloBytes(2500);
    printMegaBytesAndKiloBytes(-1024);
    printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int kb = 1024;
            int megaByte = kiloBytes / kb;
            int kbRem = kiloBytes % kb;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes +" KB = " + megaByte+" MB and " + kbRem+" KB" );
        }
    }

}

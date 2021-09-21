package com.javamasterclass;

public class PrimitiveTypesChallenge {

    public static void main(String[] args) {

        byte byteNum = 10;
        short shortNum = 20;
        int num = 50;

        long hugeNum = (50000 + ((byteNum + shortNum + num) * 10));
        System.out.println(hugeNum);
    }
}

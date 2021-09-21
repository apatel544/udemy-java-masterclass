package com.javamasterclass;

public class ByteShortIntLong {

    public static void main(String[] args) {

        int myValue = 10000;

        // Understanding the Integer(int) data type limits
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum value: " + myMinIntValue);
        System.out.println("Integer Maximum value: " + myMaxIntValue);
        System.out.println("BUSTED MAX value: " + (myMaxIntValue + 1));
        System.out.println("BUSTED MIN value: " + (myMinIntValue - 1));

        // Understanding the Byte(byte) data type limits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Maximum value = " + myMaxByteValue);

        // Understanding the Short(short) data type limits

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);

        // Understanding the Long(long) data type limits

        long myLongValue = 1000000000000000000l;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Maximum value = " + myMaxLongValue);
        System.out.println("Long Maximum value = " + myMinLongValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short newShortValue = (short) (myMinShortValue / 2);

    }
}

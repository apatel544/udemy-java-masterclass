package com.javamasterclass;

public class SumThreeAndFiveChallenge {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++) {
            int a = i % 3;
            int b = i % 5;
            if (count < 5 && a == 0 && b == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println(sum);
    }
}

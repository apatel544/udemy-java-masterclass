package com.javamasterclass;

public class WhileLoop {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(13));
//        int count = 1;
//
//        while (count != 5) {
//            System.out.println("Count Value is : " + count);
//            count++;
//        }

//        while (true) {
//            if (count == 5) {
//                break;
//            }
//            System.out.println("Count Value is : " + count);
//        }
        // DO-WHILE Example
//        do{
//            System.out.println("Count Value is : " + count);
//            count++;
//        } while (count != 6);


        int number = 4;
        int finishNumber = 20;
        int counter = 0;
        while(number  <= finishNumber){
            number++;
             if (!isEvenNumber(number)){
                 continue; // continue the loop while until the condition is not met.
             }
            System.out.println("Even number " + number);

            counter++;
             if (counter >= 5){
                 break;
             }
        }

        System.out.println("number of even numbers found: " + counter);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2)== 0) {
            return true;
        }
        return false;
    }
}

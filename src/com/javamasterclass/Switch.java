package com.javamasterclass;

public class Switch {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value not 1 or 2");
//        }

        int switchValue = 3;

//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Value was 3, 4, or 5");
//                System.out.println("Value was " + switchValue);
//                break;
//            default:
//                System.out.println("Value not 1 or 2");
//                break;
//        }

        char c = 'H';
        switch (c){
            case 'A':
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Found " + c);
                break;
            default:
                System.out.println("Didnt find A, B, C, D or E");
                break;
        }


        String month = "JANUAry";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Found " + month);
                break;
            case "may":
                System.out.println("Found " + month);
                break;
            default:
                System.out.println("Didnt find correct month, Found " + month);
                break;
        }


    }
}

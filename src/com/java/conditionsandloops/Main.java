package com.java.conditionsandloops;

import javax.print.attribute.standard.MediaSize;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

//        String fruit= input.next();

//  Using IF Statements to execute -------------------------------
//        if(fruit.equals("mango")){
//            System.out.println("King of fruits");
//        }
//        if(fruit.equals("apple")){
//            System.out.println("a sweet red fruit");
//        }
//        if(fruit.equals("grapes")){
//            System.out.println("a small little fruit");
//        }


//  Using Switch and Break statements to execute ---------------------------------
//        switch (fruit){
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("a little red sweet fruit");
//                break;
//            case "Orange":
//                System.out.println("a round fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit");

//  Using Switch statements without any break point to execute -------------------------

//            switch (fruit){
//                case "Mango" -> System.out.println("King of Fruits");
//                case "Apple" -> System.out.println("A sweet red fruit");
//                case "Orange" -> System.out.println("A round fruit");
//                case "Grapes" -> System.out.println("small fruit");
//                default -> System.out.println("Try Again, Please enter a valid fruit!");
//        }

        int day = input.nextInt();

        System.out.println(switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Data";
        });
    }
}

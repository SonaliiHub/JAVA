package com.sonali.javabasics;

import java.util.Scanner;

public class AutomaticTypePromotion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// double>long>float>int>short>char>byte
        //Example 1
//        byte a = 43;
//        byte b = 123;
//        byte c = 93;
//        int d = a * b / c;

        //Example 2
//        float e = 4.3f;
//        float f = 34.9f;
//        float g = 233.09f;

//        double h = g / (f * e);

//        System.out.println(h);

        //Example 3
        //System.out.println(3+48.4);

        //Example 4
        byte b = 43;
        char c = 'a';
        int i = 500000;
        short s = 1024;
        double d = 8423.343;
        float f = 43.32f;

        double results=(f * b) + (i / c) - (d * s);
        System.out.println((f * b) +"" + (i/c) + " "+ (d*s));
        System.out.println(results);


    }
}

package com.sonali.javabasics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       // System.out.println("Enter the first number: ");
        Float a = input.nextFloat();

       // System.out.println("Enter the second number: ");
        Float b = input.nextFloat();

        float sum = a + b;

        System.out.println("The Sum of two given integers will be: " + sum);

        }
}
package com.sonali.javabasics;

import java.util.Locale;
import java.util.Scanner;


public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//  Assignment 1: Write a program to print whether a number is even or odd, also take input from the user.
//        System.out.println("Enter any number: ");
//        int n = input.nextInt();
//        if (n%2==0){
//            System.out.println("Even Number");
//        }
//        else {
//            System.out.println("Odd Number");
//        }

//  Assignment 2: Take name as input and print a greeting message for that particular name.
//        System.out.println("Enter you name: ");
//        String name = input.nextLine();
//        System.out.println("Welcome to the world of Coding, " +name);

//  Assignment 3: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        System.out.println("Please enter the Principal Amount:");
//        int p = input.nextInt();
//        System.out.println("Please enter the time taken for interest");
//        int t = input.nextInt();
//        System.out.println("Please enter the rate at which you want the interest:");
//        float r = input.nextFloat();
//        int simpleInterest = (int) (p * t * r / 100);
//        System.out.println("Your simple interest will be in percentage as:" +simpleInterest);

//  Assignment 4: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//        System.out.println("Enter two numbers: ");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        System.out.println("Choose and enter the operation you want to perform like +,-,/,* ");
//        char op =input.next().charAt(0);
//        solve (a,b, op);
//        }
//    public static int solve(int a, int b, int op) {
//        int ans = 0;
//        //addition
//        if (op == '+') {
//            ans = a + b;
//        }
//
//        //subtraction
//        if (op == '-') {
//            ans = a - b;
//        }
//
//        //multiplication
//        if (op == '*') {
//            ans = a * b;
//        }
//
//        //Division
//        if (op == '/') {
//            ans = a / b;
//        }
//        System.out.println("Your answer is: " + ans);
//        return(ans);

//  Assignment 5 Take 2 numbers as input and print the largest number.
//        System.out.println("Please enter two integer numbers: ");
//        int a = input.nextInt();
//        int b = input.nextInt();
//
//        if (a>b) {
//            System.out.println(a);
//        }
//        else {
//            System.out.println(b);
//        }

//  Assignment 6 Input currency into rupees and o/p into dollars
//        System.out.println("Please enter the amount in rupees:");
//        int amt=input.nextInt();
//
//        int newAmount= (int)(amt*0.012);
//        System.out.println(newAmount);

//  Assignment 7: To calculate Fibonacci Series up to n numbers: a type series where each number is the sum of the two that precede it.
//    int n=10, FirstTerm=0, SecondTerm=1;
//    System.out.println("Fibonacci Series till " + n + " terms:");
//
//    for(int i =1 ; i<=n ; ++i){
//        System.out.println(FirstTerm +",");
//            int NewTerm = FirstTerm + SecondTerm;
//            FirstTerm = SecondTerm;
//            SecondTerm = NewTerm;
//        }

//Assignment 8: To find out whether the given String is Palindrome or not.
//    String name="Kayak";
//    boolean flag= true;
//
//    name= name.toLowerCase();
//        System.out.println(name);
//
//    for(int i =0; i<name.length()/2;i++) {
//        if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
//            flag = false;
//            break;
//        }
//    }
//
//    if(flag)
//        System.out.println("String is a Palindrome");
//    else
//        System.out.println("String is not a Palindrome");

//  Assignment 9: To find Armstrong Number between two given number.
//        System.out.println("Please enter the first number:");
//        int num1=input.nextInt();
//        System.out.println("Please enter the second number:");
//        int num2= input.nextInt();
//
//        for (int i = num1; i<num2; i++){
//            int check, rem, sum = 0;
//            check = i;
//            while(check != 0) {
//                rem = check % 10;
//                sum = sum + (rem * rem * rem);
//                check = check / 10;
//            }
//
//            if(sum == i){
//                System.out.println(","+i+" is an Armstrong number.");
//            }}



    }
}

package com.sonali.javabasics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Taking input from the user
        int ans = 0;

        while (true) {

            // Choose the operator
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '/' || op == '+' || op == '*' || op == '-' || op == '%') {
                System.out.println("Enter two numbers:");
                int a = in.nextInt();
                int b = in.nextInt();

                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                    ans = a / b;
                    }
                }
                if (op == '%') {
                    ans = a % b;
                }
            }
            else if (op == 'x' || op == 'X') {
                break;
            }
            else {
                System.out.println("Invalid Operator");
            }
        }
        System.out.println(ans);
    }
}


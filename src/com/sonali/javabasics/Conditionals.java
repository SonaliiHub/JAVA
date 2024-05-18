package com.sonali.javabasics;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

/* If Else Statements Syntax
    if (boolean= true/false){
        body//
        }
     Else {
     body//
     }
*/

//    int salary = 32000;
//    if (salary > 10000){
//        salary=salary+2000; // OR salary += 2000;
//    }
//    else {
//        salary=salary+1000;
//        }
//        System.out.println(salary);
//
//    for(int i=0; i <=5; i++){
//        System.out.println(i);
//    }

//    int num =1;
//    while(num<=4){
//        System.out.println(num);
//        num++;
//    }

//    int num=1;
//    do {
//        System.out.println(num);
//        num++;
//    }
//    while (num<7);

    //Largest number of all
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

//    int max=a;
//    if(b>max){
//       max=b;
//    }
//    if(c>max) {
//       max=c;
//    }
//        System.out.println(max);

//    int max=0;
//    if(a>b){
//        max=a;
//    } else {
//        max=b;
//    }
//    if(c>max) {
//        max=c;
//    }
//        System.out.println(max);

        int max = Math.max(a, b);
        if (c>max){
            max=c;
        }                               //math.max(c, math.max(a,b));
        System.out.println(max);

    }
}
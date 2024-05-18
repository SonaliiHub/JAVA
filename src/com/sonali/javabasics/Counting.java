package com.sonali.javabasics;

public class Counting {
    public static void main(String[] args) {

        int n = 1222092432, count =0;
     //   int b = 2;

        while(n>0) {
            int rem = n%10;     //this is only capturing rem value
            if(rem==2)          //Here comparing captured rem value with 2
                count++;        // Here inc no of count
            n /= 10;            // Calculating n by n/10
        }
        System.out.println(count);

    }
}

/*
int n = 898989, count = 0;

        int d = 9;

        while(n>0){
            int rem = n%10;
            if(rem == d)
                count++;
            n /= 10;
        }
        System.out.println(count);

 */
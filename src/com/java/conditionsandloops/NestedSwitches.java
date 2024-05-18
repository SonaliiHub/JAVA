package com.java.conditionsandloops;

import java.util.Scanner;

public class NestedSwitches {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empID= in.nextInt();
        String department=in.next();

        switch (empID){
            case 1:
                System.out.println("Sonali Gupta");
            break;
            case 2:
                System.out.println("Sona Gupta");
                break;
            case 3:
                System.out.println("Sonal Gupta");
               switch (department){
                   case "IT":
                       System.out.println("IT Department");
                       break;
                   case "Management":
                       System.out.println("Management Department");
                       break;
                   default:
                       System.out.println("No Department");
               }
               break;
            default:
                System.out.println("Enter Correct empID");
        }
    }
}

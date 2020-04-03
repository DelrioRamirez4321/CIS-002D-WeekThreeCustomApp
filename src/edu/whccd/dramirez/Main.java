package edu.whccd.dramirez;

/*
The purpose of the program is to be able to input two number and output the sum, subtract,product and divided between
the numbers
author: Delrio Ramirez
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter frist name: ");
        String fristName = sc.next();
        System.out.print("Enter last name: ");
        String lastName = sc.next();

        System.out.println("Hello "+ lastName + ", " + fristName + "\n"
                + "*******************");



        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter Whole Number 1: ");
        int wholeNUmber1 = sc2.nextInt();
        System.out.print("Enter Whole Number 2: ");
        int wholeNumber2 = sc2.nextInt();

        int sum = wholeNUmber1 + wholeNumber2;
        int subtract = wholeNUmber1 - wholeNumber2;
        int mutiply = wholeNUmber1 * wholeNumber2;
        int divide = wholeNUmber1 / wholeNumber2;
        int module = wholeNUmber1 % wholeNumber2;

        //String message =
                System.out.println("addiction: \t" + wholeNUmber1 + " " + "+" + " " + wholeNumber2 + " " + "=" + " " + sum );
        System.out.println("subtraction: \t" + wholeNUmber1 + " " + "-" + " " + wholeNumber2 + " " + "=" + " " + subtract );
        System.out.println("Mutipication: \t" + wholeNUmber1 + " " + "*" + " " + wholeNumber2 + " " + "=" + " " + mutiply );
        System.out.println("Division: \t" + wholeNUmber1 + " " + "/" + " " + wholeNumber2 + " " + "=" + " " + divide );
        System.out.println("Modulus: \t" + wholeNUmber1 + " " + "%" + " " + wholeNumber2 + " " + "=" + " " + module );
                /*
                + "Addiction: " + sum + "\n"
                + "Subtract: " + subtract + "\n"
                + "Mutiply: " + mutiply + "\n"
                + "divide: " + divide + "\n"
                + "Module: " + module + "\n";
                 */
        //System.out.println(message);
    }
}

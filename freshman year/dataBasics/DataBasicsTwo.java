package dataBasics;

// Humna Sultan
//Data Basics Activities
//Data Basics Two
// CompSci 9 A

import java.util.Scanner;
public class DataBasicsTwo {
    public static void main(String[] args) {
        int inches, feet, leftover;
        double centimeters;
        Scanner key = new Scanner (System.in);
        System.out.println("Enter your height in inches: ");
        inches = key.nextInt();
        feet = inches/12;
        leftover = inches%12;
        centimeters = inches*2.54;
        System.out.println("Your height in feet and leftover inches is " + feet + " feet and " + leftover + " inches.");
        System.out.print("Your height in centimeters is " + centimeters + " centimeters. ");

    }
}

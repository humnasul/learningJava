package dataBasics;

// Humna Sultan
// CompSci 9 A
// Data Basics Exercises
// Data Basics 4
import java.util.Scanner;

public class DataBasicsFour {

    public static void main(String[] args) {
        double miles, gallons, per;
        Scanner in = new Scanner (System.in);
        System.out.print("How many miles do you drive to work each day on average? " + "Enter your response:: ");

        miles = in.nextDouble();

        System.out.println("How many gallons of gasoline are purchased does your " + "car in a 5 day week on average? Enter your response:: ");
        gallons = in.nextDouble();
        per = miles/gallons;
        System.out.println("Your car's average mileage rate is " + per + " miles per gallon.");
        System.out.println("Thank you for utilizing this program " + "for your vehicle needs.");

        System.out.println("**********************************************");
    }
}
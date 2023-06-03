package dataBasics;

//Humna Sultan
// CompSci 9 A
//Data Basics Exercises
//Data Basics Three

import java.util.Scanner;
public class DataBasics3 {
    public static void main(String[] args)
    {
        double ounces,input,key;
        Scanner in = new Scanner (System.in);
        System.out.println("In the movie Raiders of the Lost Ark, Indiana Jones " + "removes a golden figurine from\n" + "a cave in the opening " + "scenes. Guess the weight of the figurine in pounds!");
        System.out.println("Enter the figurine's weight in pounds:: ");
        input = in.nextDouble();
        ounces = input*16;

        System.out.println("Your guess in ounces is " + ounces + " ounces.");
    }
}
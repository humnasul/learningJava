/**
 * Name: Humna Sultan
 * Program Name: Thinking Math B and C
 * Date: 28 September 2018
 * Extra Thing: Adding individual numbers and borders
 */

import java.util.Scanner;
//imports scanner
public class ThinkingMathBandC {
    //class name
    public static void main(String[] args) {
    //main method
        int input, num1, num2, num3, sum, leftover;
        //integer variables
        Scanner in = new Scanner (System.in);
        //calls for scanner

        System.out.println("This program will allow you to enter a 2-digit " + "number and will tell you what each number is individually.");
        //Extra information about program

        System.out.println("Enter a 2-digit number :: ");
        input = in.nextInt();
        //Asks user to type in a 2-digit number and stores the number in a variable

        num1 = input/10;
        //figures out the first number by dividing by 10 + stores in a variable
        num2 = input%10;
        //figures out the second number by finding the modulus (using 10) of the input and storing it in a variable.
        sum = num1 + num2;
        //finds the sum of individual numbers and stores it in a variable.

        System.out.println("########################");
        //Border

        System.out.println("Your number is " + input + ".");
        //Prints the input
        System.out.println("The first number is " + num1 + ".");
        //Prints the first number (found earlier)
        System.out.println("The second number is " + num2 + ".");
        //Prints the second number (found earlier)

        System.out.println("The sum of the individual numbers is " + sum + ".");
        //Prints the sum of number 1 and number 2

        System.out.println("*************************");
        //Border for part 2

        System.out.println("The second part of this program will allow you to " + "enter a 3-digit number and will tell you what each number " + "is individually.");
        //Extra information about program

        System.out.println("Enter a 3-digit number :: ");
        input = in.nextInt();
        //Asks user to type in a 3-digit number and stores the number in a variable

        num1 = input/100;
        //figures out the first number by dividing by 100 + stores in a variable
        leftover = input%100;
        //finds the modulus (using 100) of the input and stores the value in a variable so that num2 and num3 can be found.
        num2 = leftover/10;
        //finds the second number by taking the leftover and dividing by 10 + stores in variable
        num3 = leftover%10;
        //finds the third number by finding the modulus (using 10) of the leftover and stores in a variable

        sum = num1 + num2 + num3;
        //finds the sum of the three individual numbers and stores in a variable

        System.out.println("########################");
        //Border

        System.out.println("Your number is " + input + ".");
        //Prints the input

        System.out.println("The first number is " + num1 + ".");
        //Prints the first number (found earlier)
        System.out.println("The second number is " + num2 + ".");
        //Prints the second number (found earlier)
        System.out.println("The third number is " + num3 + ".");
        //Prints the third number (found earlier)

        System.out.println("The sum of the individual numbers is " + sum + ".");
        //Prints the sum of number 1, number 2, and number 3

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Border for end of program

        System.out.println("--Thank you for using this program!--");
        //End message

    }
}
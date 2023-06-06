
import java.util.Scanner;
//imports scanner
/**
 * Name: Humna Sultan
 * Program Name: Lab 3.1 - Triangle Types
 * Date: 15 October 2018
 * Extra Thing: Finding the sum of the numbers entered and
 comments
 */
public class TriangleTypes {
    //class name
    public static void main(String[] args) {
        //main class
        double side1, side2, side3, sum;
        //double variables
        Scanner in = new Scanner(System.in);
        //calls for scanner
        System.out.println("This program will determine what type of triangle will be produced from the values that you insert.");
        //extra information about the program

        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        //organization border

        System.out.println("Enter a value for side 1: ");
        side1 = in.nextDouble();
        //asks the user to enter a value for the first side of the triangle and stores it in a variable

        System.out.println("Enter a value for side 2: ");
        side2 = in.nextDouble();
        //asks the user to enter a value for the second side of the triangle and stores it in a variable

        System.out.println("Enter a value for side 3: ");
        side3 = in.nextDouble();
        //asks the user to enter a value for the third side of the triangle and stores it in a variable

        System.out.println("+++++++++++++++++++++++++++++++++");
        //organization border

        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
        /*
        if statement that checks to see if the values for the sides that were entered by the user create a triangle
        if a triangle is not created, the program moves to the commands in the "else".
         */
        {
            System.out.println("The values you entered do create a triangle.");
            /* if the values that the user entered create a triangle,
                    the program lets the user know that a triangle is created from
                    the values entered */

            if (side1 == side2 && side2 == side3)
            //if statement that checks if the triangle is equilateral
            {
                System.out.println("The values that you entered create a triangle that is an equilateral!");
                /* if the triangle is an equilateral, the program lets
                    the user know that the triangle is an equilateral */
            }
            if (side1 == side2 && side2 != side3 || side1 == side3
                    && side3 != side2 || side2 == side3 && side3 != side1)
            //if statement that checks if the triangle is isosceles
            {
                System.out.println("The values that you entered create a triangle that is isosceles!");
                /* if the triangle is isosceles, the program lets the
                user know that the triangle is isosceles */
            }
            if (side1 != side2 && side2 != side3 && side1 != side3)
            //if statement that checks if the triangle is scalene
            {
                System.out.println("The values that you entered create a triangle that is scalene!");
                /* if the triangle is scalene, the program lets the user
                    know that the triangle is scalene */
            }
        }
        else
        /* if the values entered do not create a triangle, the
        program follows whatever is contained within the else statement */
        {
            System.out.println("The values you entered do not create a triangle. Please replay the program and enter different values!");
            /* under the else statement
            If the values entered do not create a triangle,
            the program lets the user know that the
            values do not create a triangle and tells the user to enter new values */
        }

        System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}");
        //organization border

        sum = side1 + side2 + side3;
        //finds the sum of the three values that the user entered and stores it in a variable
        System.out.println("The sum of all of the values entered is " + sum + "."); }
        //prints the sum of the three values that the user entered; for extra requirement
    }
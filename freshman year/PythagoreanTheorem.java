
import java.util.Scanner;
//imports Scanner
import java.text.*;
/**
 * Name: Humna Sultan
 * Program Name: Pythagorean Theorem - Lab 2.4 Dealing With
 Decimal Output
 * Date: 2 October 2018
 * Extra Thing: Extra Info, Cost in Pennies, Borders
 */
public class PythagoreanTheorem
//class name
{
    public static void main (String[] args)
    //main method
    {
        double m, n, sideOne, sideTwo, hypotenuse, cost1, cost2, cost3, costTotal, pennies;
        //double variables
        Scanner in = new Scanner (System.in);
        //Calls for the scanner
        DecimalFormat decFor = new DecimalFormat("0.00");
        //allows for a printed number to be rounded to a certain decimal point
        DecimalFormat decFor2 = new DecimalFormat("0");
        //allows for a printed number to be rounded to a certain decimal point
        System.out.println("This program will ask the user for values for variables m and n such that m > n. The program will generate a pythagorean triple using these values.");
        //Additional information about what the program does

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        //organization border

        System.out.println("Enter a value for m :: ");
        m = in.nextDouble();
        //prompts the user to enter a value for m and stores it in a variable

        System.out.println("Enter a value for n such that n < m :: ");
        n = in.nextDouble();
        //Prompts the user to enter a value for n and stores it in a variable

        System.out.println("____________________________");
        //organization border

        System.out.println("The value for m is " + m + "." + " The value for n is " + n + ".");

        //Prints/reminds the user of the values of m and n.
        sideOne = (m*m) - (n*n);
        System.out.println("The first leg of the right triangle is " + sideOne + " units long.");
        //Calculates the first leg of the right triangle using the formula given and prints the length of the leg.
        sideTwo = 2*m*n;
        System.out.println("The second leg of the right triangle is " + sideTwo + " units long.");
        //Calculates the second leg of the right triangle using the formula given and prints the length of the leg.
        hypotenuse = (m*m) + (n*n);
        System.out.println("The length of the hypotenuse is " + hypotenuse + " units");
        //Calculates the hypotenuse of the right triangle using the formula given and prints the length of the hypotenuse.

        System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*");
        //organization border

        System.out.println("The triple is " + sideOne + "," + sideTwo + "," + hypotenuse + ".");
        //Prints the triple (found earlier).

        System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*");
        //organization border

        cost1 = 2.412*sideOne;
        //finds the cost of the first leg using the formula given.
        cost2 = 3.767*sideTwo;
        //finds the cost of the second leg using the formula given.
        cost3 = 15.758*hypotenuse;
        //finds the cost of the hypotenuse using the formula given.

        costTotal = cost1 + cost2 + cost3;
        //Finds the total cost by adding the costs of each of the sides of the triangles.
        pennies = costTotal*100;
        //finds the total cost in pennies by multiplying by 100 (100 pennies in a dollar).

        System.out.println("The total cost of the triple is about $" + decFor.format(costTotal) + ".");
        //Prints the total cost with a caption

        System.out.println("()()()()()()()()()()()()()()()()()()");
        //organization border

        System.out.println("The total cost of the triple in pennies is about " + decFor2.format(pennies) + " pennies.");
        //prints the total cost in pennies with a caption
    }
}
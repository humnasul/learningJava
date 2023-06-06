
import java.util.Scanner;
//imports Scanner

import java.text.*;
//imports decimal output
/**
 * Name: Humna Sultan
 * Program Name: 4.2 Vacation Mileage
 * Date: 4 December 2018
 * Extra Thing: if statement judging your vacation opinions
 */
public class Vacay
//class name
{
    public static void main(String[] args)
//main method
    {
        double miles, totMiles, totGal, week, galBuy, mpg1, mpg2;
        String loc;
        Scanner in = new Scanner(System.in);
        //calling for scanner and double variables

        DecimalFormat decFor = new DecimalFormat("0.00");
        miles = 0;
        totMiles = 0;
        week = 0;

        galBuy = 0;
        mpg1 = 0;
        mpg2 = 0;
        totGal = 0;
        //initializing variables

        System.out.println("********************");
        System.out.println(" Vacation Mileage ");
        System.out.println("********************");

        System.out.println("(Enter -99 for the number of miles when vacation is over) \n");

        System.out.println("Enter your vacation location :: ");
        loc = in.nextLine();
        if (loc.equalsIgnoreCase("Orlando"))
        {
            System.out.println("Take me with you!!!! \n");
        }
        else
        {
            System.out.println("The place that you are going to is unfortunately boring... \n");
        }
        System.out.println("How many miles did you travel this week?");
        miles = in.nextDouble();
        //asks number of miles travelled

        while (miles != -99)
        //while loop for when miles is not equal to -99
        {
            System.out.println("How many gallons of gasoline did you purchase this week?");
            //asks for number of gallons purchased this week

            galBuy = in.nextDouble();
            week++;
            mpg1 = miles/galBuy;
            totMiles = totMiles + miles;
            totGal = totGal + galBuy;

            mpg2 = totMiles/totGal;
            //calculations and values for variables

            System.out.println("Week: " + decFor.format(week)
                    +"\n"
                    + "Miles: " + decFor.format(miles)
                    + "\t" + "Vacation miles travelled: " + decFor.format(totMiles)
                    + "\n"
                    + "Gallons: " +
                    decFor.format(galBuy) + "\t" + "Vacation gallons purchased: " +
                    decFor.format(totGal) + "\n"
                    + "MPG: " + decFor.format(mpg1) +
                    "\t" + "MPG for the vacation: " + decFor.format(mpg2) + "\n");
                    //prints necessary info

            System.out.println("How many miles did you travel this week?");

            miles = in.nextDouble();
            //collecting output

        }
        System.out.println("\nVacation over!!!");
        //occurs if miles is -99

    }
}

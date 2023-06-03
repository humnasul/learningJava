import java.util.Scanner;
//imports Scanner
import java.text.*;
//imports Decimal Format
/**
 * Name: Humna Sultan
 * Program Name: Movie Inventory - Lab 2.5
 * Date: 4 October 2018
 * Extra Thing: Comments, "thank you", "Movie Inventory" label in
 beginning
 */
public class MovieInventory {
    //class name
    public static void main(String[] args)
    //main method
    {
        int numLord, numDennis, numKid, numTotal;
    //integer variables
        double costLord, costDennis, costKid, tcostLord,

                tcostDennis, tcostKid, totalCost, averageCost;

        //double/decimal variables
        Scanner in = new Scanner (System.in);

        //calls for Scanner
        DecimalFormat decFor = new DecimalFormat("0.00");
        //Creates Decimal Format for program/calls for
        System.out.println("**Movie Inventory**");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
        //Extra info and border
        System.out.println("How many copies of \"Lord of the RingDings\" are there? :: ");
        numLord = in.nextInt();
        //asks the user to enter the number of copies of a movie and stores it in a variable

        System.out.println("How much does \"Lord of the RingDings\" cost? :: ");

        costLord = in.nextDouble();
        //asks the user for the cost of a movie and stores it in a variable

        System.out.println("___________________________________");

        //organization border
        System.out.println("How many copies of \"Dennis The Dentist Menace\" are there? :: ");
        numDennis = in.nextInt();
        //asks the user to enter the number of copies of a movie and stores it in a variable

        System.out.println("How much does \"Dennis The Dentist Menace\" cost? :: ");

        costDennis = in.nextDouble();
        //asks the user for the cost of a movie and stores it in a variable

        System.out.println("___________________________________");

        //organization border
        System.out.println("How many copies of \"Spy Kids Aged 52\" are there? :: ");

        numKid = in.nextInt();
        //asks the user to enter the number of copies of a movie and stores it in a variable

        System.out.println("How much does \"Spy Kids Aged 52\" cost? :: ");

        costKid = in.nextDouble();
        //asks the user for the cost of a movie and stores it in a variable

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        //organization border
        tcostLord = numLord*costLord;
        //finds the total cost of all of the copies of Lord
        tcostDennis = numDennis*costDennis;
        //finds the total cost of all of the copies of Dennis
        tcostKid = numKid*costKid;
        //finds the total cost of all of the copies of Kid
        numTotal = numLord + numDennis + numKid;
        //finds the total number of all of the copies
        totalCost = tcostLord + tcostDennis + tcostKid;
        //finds the total cost by adding all of the individual costs of all of the movies

        System.out.println("The total value of all the tapes is: $" + decFor.format(totalCost));

        //prints the total cost with a caption in Decimal Format
        averageCost = totalCost/numTotal;
        //finds the average cost of each movie by dividing the total cost by the total number of movies

        System.out.println("The average value is: $" + decFor.format(averageCost));

        //prints the average cost of each movie with a caption in Decimal Format

        System.out.println("---Thank you for using the \"Yes, We Speak English, Video Store\"'s movie inventory system. --- ");
    }
}
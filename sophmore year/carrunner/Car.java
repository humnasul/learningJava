/**
 * Name: Humna Sultan
 * Program Name: car Class Lab 2
 * Date: 17 September 2019
 * Extra: Asks user for how much total they have driven; does
 not assume 9000 miles
 */
package carrunner;
//package
import java.util.Scanner;
//importing
public class Car {
    //class name
    public Car(int driven, int per)
    {
    }
    //constructor
    public static void timeForOilChange(int driven, int per)
    //method for checking if oil is needed
    {
        Scanner in = new Scanner(System.in);
        //scanner
        System.out.println("Would you like to continue through the program? (y/n) :: ");

        String ans = in.nextLine();
        if (ans.equalsIgnoreCase("y"))
        {
        }
        if(ans.equalsIgnoreCase("n"))
        {
            System.out.println();
            System.out.println("Bye bye!");
            System.exit(0);
        }
        //asks if user wants to continue through program; does appropriate actions

        System.out.println("Number of Miles Driven: " + driven);
        System.out.println("**************************************");

        //prints number of miles + border
        if (driven >= per)
        {
            System.out.println("You need to get an oil change!");
            System.out.println("------------------------------");
            System.out.println("Oil change completed!");
            driven = 0;
            System.out.println();
            addMiles(driven, per);
        }
        else{
            System.out.println("You currently do not need an oil change.");

            System.out.println();
            addMiles(driven, per);
        }
        //checks if oil change is needed. Does appropriate actions and goes to addMiles method
    }
    public static void addMiles(int driven, int per)
    //method that adds miles to program
    {
        Scanner in = new Scanner(System.in);
        //scanner

        System.out.println("#####- Driving - #####");
        System.out.println();
        //border + skips line

        System.out.println("How many miles have you just driven? :: ");

        int miles = in.nextInt();
        driven+=miles;
        //asks how many miles that the user wants to add and adds

        timeForOilChange(driven, per);
        //goes to other method

    }
}

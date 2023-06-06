
import java.util.Scanner;
//imports Scanner
import java.text.*;
//imports Decimal Format
/**
 * Name: Humna Sultan
 * Program Name: Lab 2.6 - Piggybank Problem
 * Date: 7 October 2018
 * Extra Thing: Thanking the user and comments
 */
public class PiggybankProblem {
    //class name
    public static void main(String[] args) {
    //main class
        String name;
        //string variable
        int numQuarters, numDimes, numNickels, numPennies;
        //integer variables
        double costQuarters, costDimes, costNickels, costPennies, totalMoney, numWeek, avWeek, totalYear;
        //double variables
        Scanner in = new Scanner (System.in);
        //calls for scanner

        DecimalFormat decFor = new DecimalFormat("0.00");
        //calls for decimal format
        System.out.println("++Piggybank Money Helper Program++");
        //title of program

        System.out.println("Enter your name :: ");
        name = in.nextLine();
        //asks user for his/her name and stores it in a variable
        System.out.println("Your name is " + name + ".");
        //reprints the user's name
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        //organization border
        System.out.println("How many quarters do you have?");
        numQuarters = in.nextInt();
        //asks the user to input the number of quarters that the user has and stores the number in a variable
        costQuarters = numQuarters*0.25;
        //finds the monetary value of the quarters that the user has
        System.out.println("How many dimes do you have?");
        numDimes = in.nextInt();
        //asks the user to input the number of dimes that the user has and stores the number in a variable
        costDimes = numDimes*0.10;
        //finds the monetary value of the dimes that the user has
        System.out.println("How many nickels do you have?");
        numNickels = in.nextInt();
        //asks the user to input the number of nickels that the user has and stores the number in a variable
        costNickels = numNickels*0.05;
        //finds the monetary value of the nickels that the user has

        System.out.println("How many pennies do you have?");
        numPennies = in.nextInt();
        //asks the user for the number of pennies that the user has and stores it in a variable
        costPennies = numPennies*0.01;
        //finds the monetary value of the pennies that the user has
        System.out.println("How many weeks have you been saving money for?");
        numWeek = in.nextDouble();
        //asks the user for the number of weeks that the user has been saving for and stores it in a variable

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        //organization border

        System.out.println("Number of quarters: " + numQuarters);
        //prints the number of quarters that the user has
        System.out.println("Monetary value of quarters: $" + decFor.format(costQuarters));
        //prints the value of the quarters that the user has in decimal format.
        System.out.println("Number of dimes: " + numDimes);
        //prints the number of dimes that the user has
        System.out.println("Monetary value of dimes: $" + decFor.format(costDimes));
        //prints the value of the dimes that the user has in decimal format.
        System.out.println("Number of nickels: " + numNickels);
        //prints the number of nickels that the user has
        System.out.println("Monetary value of nickels: $" + decFor.format(costNickels));
        //prints the value of the nickels that the user has in decimal format.
        System.out.println("Number of pennies: " + numPennies);
        //prints the number of pennies that the user has

        System.out.println("Monetary value of pennies: $" + decFor.format(costPennies));
        //prints the value of the pennies that the user has in decimal format.
        totalMoney = costQuarters + costDimes + costNickels + costPennies;
        //finds the total amount of money that the user has and stores it in a variable

        System.out.println("Number of weeks that " + name + " has saved money for: " + numWeek);
        //prints the number of weeks that the user has saved for

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        //organization border

        System.out.println("The grand total is :: $" + decFor.format(totalMoney));
        //prints the grand total

        System.out.println("************************************");
        //organization border

        avWeek = totalMoney/numWeek;
        //finds the average amount of money that the user saves each week

        System.out.println("You have saved about $" + decFor.format(avWeek) + " per week");
        //prints the average amount of money that the user has been saving per week

        System.out.println("************************************");
        //organization border

        totalYear = 52*avWeek;
        //finds the total amount of money that would be saved in a year

        System.out.println(name + ", at this rate, you can save about $" + decFor.format(totalYear) + " in one year.");
        //prints the total amount of money that would be saved in a year

        System.out.println("************************************");
        //organization border

        System.out.println("---Thanks for using this program, " + name + "!---");
        //thanks the user for using the program and utilizes their name.
    }
}

import java.util.Scanner;
//imports scanner
import java.text.*;
//imports Scanner
/**
 * Name: Humna Sultan
 * Program Name: Lab 2.4 #1; Concrete For Builders
 * Date: 2 October 2018
 * Extra Thing: Finding cost in quarters, borders, comments, and
 extra info
 */
public class ConcreteForBuilders
//class name
{
    public static void main(String[] args)
    //main method
    {
        double poles, volume, volyards, num, cost, concrete, quartcost;
        //double variables

        Scanner in = new Scanner (System.in);
        //Specifies Scanner name
        DecimalFormat decFor = new DecimalFormat("0.00");
        //rounds a printed variable to a certain decimal point.
        DecimalFormat decFor2 = new DecimalFormat("0");
        //rounds a printed variable to a certain decimal point

        System.out.println("This program will help prospective builders determine the amount of concrete needed for the foundation of a pole barn. ");

        System.out.println("The program will also provide builders with the total cost of all the concrete.");
        //Extra information about what the program will do

        System.out.println("*************************************************");
        //Organization border

        System.out.println("Enter the number of poles required for the pole barn :: ");
        poles = in.nextDouble();
        //Asks the user to input the number of poles need to build the pole barn and stores the value in a variable.

        System.out.println("------------------------------");
        //Organization border

        System.out.println("The number of poles needed for the pole barn is " + poles + " poles.");
        //Repeats the number of poles that the user inputted.
        volume = 3.14*1.5*1.5*5;
        //Finds the volume of each cylindrical pad in cubic feet using the information given in the prompt.

        System.out.println("The volume of each cylindrical pad for each of the poles is about " + decFor.format(volume) + " cubic feet.");

        //Prints the volume of each cylindrical pad in cubic feet (found earlier) for the user's reference.
        volyards = volume/27;
        //Figures out the volume of each cylindrical pad in cubic yards, since the price is $12.98 per cubic yard and I previouslyfound the volume in cubic feet.

        System.out.println("Each cylindrical pad is about " + decFor.format(volyards) + " cubic yards.");
        //Prints the volume of each cylindrical pad in cubic yards (found earlier) for the user's reference.

        System.out.println("The number of pole foundations needed to go all the way around the building is " + poles + " pole foundations.");
        //Reminds the user of the number of poles needed for the pole barn.

        concrete = volyards*poles;
        //Figures out the amount of concrete needed by taking the volume of each cylindrical pad in cubic yards and multiplying by the number of poles needed.

        System.out.println("Since each concrete cylindrical pad for each pole is " + decFor.format(volyards) + " cubic yards and " + poles + " poles are needed, the amount of concrete needed is about " + decFor.format(concrete) + " cubic yards.");
        //Prints the amount of concrete needed (found earlier).
        cost = concrete*12.98;
        //Finds the cost by taking the amount of concrete needed in cubic yards and multiplying by the cost of concrete per cubic yard.

        System.out.println("The cost of concrete is $12.98 per cubic yard. The total cost of the concrete needed for the pole barn is about " + decFor.format(cost) + " dollars.");
        //Tells the user the price of concrete per cubic yard and prints the total cost of all the concrete (found earlier).

        System.out.println("````````````````````````````````````````");
        //Organization border
        quartcost = cost*4;
        //Finds the cost of the concrete quarters by multiplying by 4.

        System.out.println("My favorite coin is a quarter. I love quarters! The total cost of the concrete in quarters is about " + decFor2.format(quartcost) + " quarters.");
        //Prints the cost of the concrete in quarters.

    }
}

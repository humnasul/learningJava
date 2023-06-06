/*
 * Name: Humna Sultan
 * Program Name: Thinking Math: Part A
 * Date: 9/28/18
 * Extra Thing: Borders and Information
 */

import java.util.Scanner;
//imports Scanner
public class ThinkingMathA {
    //class name
    public static void main(String[] args) {
    //main method
        int teams, players, remainplay;
        //integer variables
        Scanner in = new Scanner (System.in);
        //calls for Scanner
        System.out.println("Volleyball is played in teams of 7.");
        //Prints Information

        System.out.println("This program will help to figure out the number " + "of teams that can be made with a certain number of people " + "and will find the number of people remaining.");
        //prints more information

        System.out.println("_____________________");
        //organization border

        System.out.println("Enter the number of players present :: ");
        players = in.nextInt();
        //Asks the user for the number of players and stores it in a variable.

        teams = players/7;
        //divides the number of players by seven to get the number of teams and stores it in a variable
        remainplay = players%7;
        //Finds the modulus, the number of players left over after teams are made and stores it in a variable

        System.out.println("......................");
        //Organization border

        System.out.println("There will be " + teams + " teams with " + remainplay + " player(s) left over.");
        //prints the number of teams and remaining players with a caption.
    }
}

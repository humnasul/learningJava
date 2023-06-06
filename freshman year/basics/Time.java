
import java.util.Random;
//importing
/**
 * Name: Humna Sultan
 * Program Name: 6.5
 * Date: 27 February 2019
 * Extra Thing: In #4; asking having an additional 12 sided die
 */
public class Time {
    //class name
    public static void main(String[] args)
    {
        thr();
        System.out.println("##############################");
        four();
        System.out.println("##############################");
        five();
        System.out.println("##############################");
        six();
        System.out.println("##############################");
        //calling methods in main method
    }
    public static void thr()
    {
        int num = (int) (Math.random()*15 + 1);
        System.out.println(num);
    }
    //making a variable a random number in three

    public static void four()
    {
        int one = (int) (Math.random()*6 + 1);
        int two = (int) (Math.random()*6 + 1);
        int thr = (int) (Math.random()*12 + 1);
        //seting variables to random numbers; acting like dice
        System.out.println("The roll of die one with 6 sides was " + one + ".");

        System.out.println("The roll of die two with 6 sides was " + two + ".");

        System.out.println("The roll of die three with 12 sides was " + thr + ".");

        int num = one+two+thr;
        System.out.println("The sum of all of the rolls of the dice is " + num + ".");
    }
    //rolling dice in four

    public static void five()
    {
        int num = (int)(Math.random()*78+35);
        //changing value of variable
        System.out.println(num);
    }
    //setting a variable to between 35 and 78 in five

    public static void six()
    {
        int num, tries;
        tries = 0;
        num =0;
        //initializing and declaring variables

        while (num!=2)
        {
            num = (int) (Math.random()*6 + 1);
            System.out.println("The roll of the die was " + num + ". Trying again!");

            tries = tries + 1;
            //adds one each time the die is rolled
        }
        //rolls dice while a 2 is not rolled
        System.out.println("The number of times that the die had to roll to get a 2 was " + tries + " time(s).");
    }
    //rolling dice until you roll a 2 in six
}
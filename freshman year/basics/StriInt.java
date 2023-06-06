
import java.lang.Character;
import java.lang.String;
import java.util.Scanner;
//importing
/**
 * Name: Humna Sultan
 * Program Name: 6.4
 * Date: 25 February 2019
 * Extra Thing: In #1; asking for user input of a number and then
 multiplying
 */

public class StriInt {
    //class name
    public static void main(String[] args)
    //main method
    {
        Scanner in = new Scanner(System.in);
        //calling scanner

        System.out.println("-----------------------");
        one();
        System.out.println("-----------------------");
        two();

        System.out.println("-----------------------");
        three();
        System.out.println("-----------------------");
        //calling other variables
    }
    public static void one()
    //method for #1
    {
        Scanner in = new Scanner(System.in);
        //calls scanner
        String horses = "35 horses";

        String num = horses.substring(0, 2);
        //finds number in string
        int mult = Integer.parseInt(num);
        //changes number in string to an integer
        int mult2 = mult*4;
        //multiples number by 4 to get the number of legs of 35 horses

        System.out.println(mult + " horses have " + mult2 + " legs!");
        //prints number of legs.

        System.out.println("Enter a 2 digit positive integer" +
                " that is equal to the number of legs that your animal has ::");

        int input = in.nextInt();
        System.out.println("The number you entered times 35 is "
                + input*35 + ". 35 of your animal has " + input*35 + " legs!");
        //asks user to enter number of legs and calculates number of legs for 35 of the animal
    }
    public static void two()
    //method for #2
    {
        String wordy = "AB2CD8EF9G";
        //string used in program
        String st = "";
        int leng = wordy.length();
        char ch = 'a';

        for (int i = 0; i < leng; i++)
        {
            ch = wordy.charAt(i);
            if (Character.isDigit(ch))
            {
                st = st + ch;
            }
        }
        //finds the numbers in the string and stores them in a variable

        int leng2 = st.length();
        int num = 0;
        int num2 = 0;
        char ch2 = 'a';
        String a = "";
        //declaring variables for for loop

        for (int i = 0; i < leng2; i++)
        {
            ch2 = st.charAt(i);
            a = Character.toString(ch2);
            num = Integer.parseInt(a);
            num2 = num2+num;
        }
        /*finds the sum of the numbers by finding the number at
        i and changing that number to an integer to add to variable */

        System.out.println("The digits in the string wordy are "
                + st + ". The sum of the digits in the string wordy is " + num2
                + ".");
        //prints sum and digits
    }
    public static void three()
    {
        String launch = "54321";
        int blah = 0;
        for (int i = 0; i < launch.length(); i++)
        {

            System.out.print(launch.charAt(i) + "-");
            if (i == 4)
            {
                System.out.print("Go!");
            }
        }
        /*for loop that prints each number separated by a dash
        (-) and then printing go at the last iteration of the for loop*/

        int num2 = 0;
        int num = 0;
        //declaring variables for for loop

        for (int j = 0; j < launch.length(); j++)
        {
            char ch = launch.charAt(j);
            String a = Character.toString(ch);
            num = Integer.parseInt(a);
            num2 = num2+num;
        }
        /*for loop that prints the sum of the numbers by finding
        the number at i and changing that number to an integer to add to variable */

        System.out.println();
        //moves cursor
        System.out.println(num2 + "-Go!");
        //prints go at the end of the for loop
    }
}

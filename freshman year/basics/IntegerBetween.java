
import java.util.Scanner;
//imports Scanner
/**
 * Name: Humna Sultan
 * Program Name: 3.1 - Integer Between
 * Date: 15 October 2018
 * Extra Thing: Extra if statement that allows user to get
 $1,000,000 or get laughed at
 */
public class IntegerBetween
//class name
{
    public static void main (String[] args) {
    //main class
        int num, num2;
        //integer variables
        Scanner in = new Scanner(System.in);
        //calls for Scanner

        System.out.println("Enter an integer between 50 and 100 :: ");
        num = in.nextInt();
        //asks the user to enter a value between 50 and 100 and stores it in a variable
        if (num > 50 && num < 100)
        //if the number entered was between 50 and 100, the program follows through with methods under here
        {
            System.out.println("You've won $" + num + "! Congratulations!");
            //tells the user that they have won a certain amount of money
        }
        else
        //if the number was not between 50 and 100, the program follows the methods under here
        {
            System.out.println("Sorry, not following directions will cost you dearly : - (");
            //tells the user that not following directions will cost the person dearly
        }

        System.out.println("----------------------------");
        //organization border

        System.out.println("Enter another integer :: ");
        num2 = in.nextInt();
        //asks the user to enter another integer and stores it in a variable

        if (num2 == 67)
        //the number just entered by the user is 67, the methods under here are followed
        {
            System.out.println("You've won $1,000,000!");
            //prints/tells the user that they have won 1 million dollars
        }
        else
        //if the number just entered by the user is not 67, the methods under here are followed
        {
            System.out.println("You've won nothing! HAHAHAHAHAHA!");
            //prints/tells the user that they have gained nothing
        }
    }
}

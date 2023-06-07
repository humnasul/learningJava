
import java.util.Scanner;
//imports Scanner
/**
 * Name: Humna Sultan
 * Program Name: 3.4 - Grades
 * Date: 25 October 2018
 * Extra Thing: case for A+
 */
public class Grades
//class name
{
    public static void main(String[] args)
    //main method
    {
        String input;
        //string variable
        Scanner in = new Scanner(System.in);
        //calls for Scanner in class
        System.out.println("Enter your grade :: ");
        input = in.nextLine();
        //asks the user to enter their grade and stores it in variable

        switch(input)
        //switch statement that performs different tasks based on grade
        {
            case "A+":
            {
                System.out.println("YAYYYYYYYY!");
                break;
            }
            //extra case
            case "A":
            {
                System.out.println("Your work is outstanding!");
                break;
            }
            //case if user got an A
            case "B":
            {
                System.out.println("You are doing good work!");
                break;
            }
            //case if user got a B
            case "C":
            {
                System.out.println("Your work is satisfactory.");
                break;
            }
            //case if user got a C
            case "D":
            {
                System.out.println("You need to work a little harder.");

                break;
            }
            //case if user god t a D
            case "F":
            {

                System.out.println("Please see me for extra help!");

                break;
            }
            //case if user got an F
        }
    }
}
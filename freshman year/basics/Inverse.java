
/**
 * Name: Humna Sultan
 * Program Name: 5.2 Inverse (Lab 2)
 * Date: 10 January 2019
 * Extra Thing: On other lab
 */
import java.util.Scanner;
//imports Scanner
public class Inverse {
    //class name
    public static void main(String[] args) {
    //main method
        double num1, num2, result, add, place;
        //variables

        Scanner in = new Scanner (System.in);
        //calls for Scanner
        num1 = 2;
        num2 = 7;
        add = 1/num1 + 1/num2;
        place = 2.0;
        //initializing variables
        result = Inver(num1, num2, add, place);
        //making a variable equal to what is returned by a method

        System.out.println("The harmonic mean of the two numbers is " + result + ".");
        //gives user info
    }
    public static double Inver(double num1, double num2, double
            add, double place)
    {
        double a = place/add;
        //finds harmonic mean
        return a;
        //returns value
    }
}

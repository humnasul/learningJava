package QuadraticEquation;
import java.util.Scanner;
/**
 * Name: Humna Sultan
 * Program Name: Chap. 5 P5.1
 * Date: 7 October 2020
 * Extra: Asks for user input;
 */
public class QuadraticEquation {
    static double a;
    static double b;
    static double c;
//instance variables
    /**
     main method; creates constructor for testing
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value for 'a' in the quadratic formula :: ");
        a = in.nextDouble();
        System.out.println("Enter a value for 'b' in the quadratic formula :: ");
        b = in.nextDouble();
        System.out.println("Enter a value for 'c' in the quadratic formula :: ");
        c = in.nextDouble();
        //extra: user input

        QuadraticEquation test = new QuadraticEquation(a, b, c);
        if(test.hasSolutions())
        {
            System.out.println("Solution 1 (-) : " + test.getSolution1());
            System.out.println("Solution 2 (+) : " + test.getSolution2());
        }
        //if there are real solutions to the problem, call methods and print solutions
        else
        {
            System.out.println("There are no real solutions for this problem.");
        }
        //if there are not real solutions to the problem, inform the user
    }
    /**
     method that finds out whether there are real solutions to the quadratic equation values
     given
     @return calc: true if there are real solutions
     */
    public boolean hasSolutions()
    {
        double calc;
        calc = (b*b) - (4*a*c);
        if (calc < 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    /**
     method that calculates quadratic formula solution 1 using instance variables
     @return calc1: returns solution 1
     */
    public double getSolution1()
    {

        double calc1 = (b*-1) - Math.sqrt((b*b)-(4*a*c));
        calc1 = calc1 / (2*a);
        return calc1;
    }
    /**
     method that calculates quadratic formula solution 2 using instance variables
     @return calc2: returns solution 2
     */
    public double getSolution2()
    {
        double calc2 = (b*-1) + Math.sqrt((b*b)-(4*a*c));
        calc2 = calc2/(2*a);
        return calc2;
    }
    /**
     method that takes parameters and puts values into instance variables
     a : value that is hard-coded when declaring constructor, used to set instance
     variables
     b : value that is hard-coded when declaring constructor, used to set instance
     variables
     c : value that is hard-coded when declaring constructor, used to set instance
     variables
     */
    public QuadraticEquation(double q_a, double q_b, double q_c)
    {
        a = q_a;
        b = q_b;
        c = q_c;
    }

}
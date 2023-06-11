/**
 * Name: Humna Sultan
 * Program Name: Rational Lab
 * Date: 4 October 2019
 * Extra: Asks user to input values for fractions
 */
package rational;
//package
import java.util.Scanner;
//Scanner import
public class Rational {
    //class name
    public void setRational()
    //asks user for vals
    {
        Scanner in = new Scanner(System.in);
        //calls Scanner
        System.out.println();
        System.out.println("Enter a value for the first numerator :: ");

        int num1 = in.nextInt();
        System.out.println("Enter a value for the second numerator :: ");

        int num2 = in.nextInt();
        System.out.println("Enter a value for the first denominator :: ");

        int den1 = in.nextInt();
        System.out.println("Enter a value for the second denominator :: ");

        int den2 = in.nextInt();
        //asks user for values and stores responses in variables
        newNum(num1, num2, den1, den2);
        //calls method for getting fractions/calculating
    }
    public void newDeno(int den1, int den2, double new_num)
    {
        double new_den = den1*den2;
        //calculates
        print(new_num, new_den);
        //calls method for printing
    }
    public void newNum(int num1, int num2, int den1, int den2)
    //calculations
    {
        double var1 = num1*den2;
        double var2 = num2*den1;
        //calculates
        double new_num = var1 + var2;
        //stores
        compare(num1, num2, den1, den2);
        //calling method for comparing values

        System.out.println(num1 + "/" + den1 + " + " + num2 + "/" + den2);
        //prints values
        newDeno(den1, den2, new_num);
        //calls method for finding new denominator
    }
    public void print(double new_num, double new_den)
    {
        System.out.print(" = " + new_num + "/" + new_den);
        //prints final fraction
    }

    public void compare(int num1, int num2, int den1, int den2)
    //compares values and prints appropriate result
    {
        double div1 = num1/den1;
        double div2 = num2/den2;
        //calculates fractions
        if (div1 > div2)
        {
            System.out.println("rOne = " + num1 + "/" + den1);
            System.out.println("rTwo = " + num2 + "/" + den2);
            System.out.println("rOne is greater than rTwo.");
        }
        //result if the first fraction is greater than the second fraction

        if (div1 < div2)
        {
            System.out.println("rOne = " + num1 + "/" + den1);
            System.out.println("rTwo = " + num2 + "/" + den2);
            System.out.println("rOne is less than than rTwo.");
        }
        //result if the first fraction is less than the second fraction

        if (div1 == div2)
        {
            System.out.println("rOne = " + num1 + "/" + den1);
            System.out.println("rTwo = " + num2 + "/" + den2);
            System.out.println("rOne and rTwo are equal.");
        }
        //result if the fractions are equal
    }
}

/**
 * Name: Humna Sultan
 * Program Name: P4.7 Measurement Conversions Lab
 * Date: 4 October 2019
 * Extra: Calculates meters to centimeters
 */

package converter;
//package
import converter.Converter;

import java.util.Scanner;
//importing Scanner
public class ConverterRunner {
    //class name
    public static void main(String[] args)
    //main method
    {
        Converter convert = new Converter();
        //creates object
        Scanner in = new Scanner(System.in);
        //calls scanner

        System.out.println("Enter a value in meters :: ");
        double meters = in.nextDouble();
        //gets input

        System.out.println("---------------------------------------------");
        //border

        convert.convertTo_miles(meters);
        //calls method in object to convert to miles
    }

}

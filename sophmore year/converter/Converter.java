/**
 * Name: Humna Sultan
 * Program Name: P4.7 Measurement Conversions Lab
 * Date: 4 October 2019
 * Extra: Calculates meters to centimeters
 */
package converter;
//package
import java.util.Scanner;
//importing Scanner
public class Converter
//class name
{
    public Converter()
    {
    }
    //constructor
    public void convertTo_miles(double meters)
    {
        double miles = meters*0.000621371;
        System.out.println(meters + " meters to miles is " + miles
                + " miles.");
        convertTo_feet(meters, miles);
    }
    //calculates meters to miles and prints
    //calls feet method

    public void convertTo_feet(double meters, double miles)
    {
        double feet = miles*5280;
        System.out.println(meters + " meters to feet is " + feet +
                " feet.");
        convertTo_inches(meters, feet);
    }
    //calculates miles to feet and prints
    //calls inches method

    public void convertTo_inches(double meters, double feet)
    {
        double inch = feet*12;
        System.out.println(meters + " meters to inches is " + inch
                + " inches.");
        convertTo_centi(meters, inch);
    }
    //calculates feet to inches and prints
    //calls centimeter method : extra
    public void convertTo_centi(double meters, double inch)
    {
        double centi = inch*2.54;
        System.out.println(meters + " meters to centimeters is " +
                centi + " centimeters.");
    }
    //calculates inches to centimeters and prints
    //extra
}

import java.text.*;
//imports Decimal Format
import java.util.Scanner;
//imports Scanner
public class Midyear
//class name
/**
 * Name: Humna Sultan
 * Program Name: Unit 5 Exam Lab 2
 * Date: 23 January 2019
 * Extra Thing: N/A
 */

{
    public static void main(String[] args)
    //main method
    {
        double mid, fin, aver;
        //double variables
        Scanner in = new Scanner(System.in);
        //calls for scanner in method

        System.out.println("What is your midyear exam score in Java? :: ");

        mid = in.nextDouble();
        //asks user score and stores

        System.out.println("What is your final exam score in Java? :: ");

        fin = in.nextDouble();
        //asks user score and stores
        aver = aver(mid, fin);
        //calls for method
        System.out.println("Your average is " + aver);
        //tells average

        if (aver < 80)
        {
            bad();
        }
        if (aver >= 80)
        {
            good();
        }
        //if statements for results
    }
    public static double aver(double mid, double fin)
    {

        double i = mid + fin + fin;
        double j = i/3;
        return j;
    }
    //method that gets average
    public static void bad()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the name of your advisor? :: ");
        String u = in.nextLine();

        System.out.println("You should consult your advisor, " +
                u + ", about your major.");
    }
    //method that tells user if doing bad

    public static void good()
    {
        System.out.println("You are doing well in your major.");
    }
    //method that tells user if doing good

}
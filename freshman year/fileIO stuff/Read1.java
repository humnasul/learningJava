
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
//importing
public class Read1 {
//class name
    /**
     * Name: Humna Sultan
     * Program Name: 7.5
     * Date: 26 March 2018
     * Extra Thing: Prints out rounded square root of

     variance
     */

    public static void main(String[] args)
    //main method

    {
        int num, num2, i, blo;
        double sqr, aver, num3, num4, num5, num6, num7;
        File file;
        Scanner in = null;
        //declaring variables

        try
        //try
        {
            sqr = 0;
            aver = 0;
            num2 = 0;
            num3 = 0;
            num4 = 0;
            num = 0;
            num5 = 0;
            num6 = 0;
            num7 = 0;
            i = 0;
            blo = 0;
            //initializing variables

            file = new File("src/ScoreData.txt");
            in = new Scanner(file);
            //setting file and in equal

            while(in.hasNext())
            //while there is more text
            {
                if(in.hasNext())
                //if statement that checks if there is more text
                {
                    while (i != 40)
                    {
                        i++;
                    }
                    //makes sure that i is 40, or the number of numbers total in the file

                    while (aver != 80)
                    {
                        aver++;
                    }
                    //makes sure the average is the average in the number set

                    blo++;
                    //variable is used later

                    num = in.nextInt();
                    //sets num to next number in file

                    num3 = num-aver;
                    sqr = Math.pow(num3, 2);
                    //finds square difference by finding difference and squaring
                    num4 = num4 + sqr;

                    System.out.println("Squared difference of num " + blo + ": " + sqr);
                    //prints square difference
                }
            }
            System.out.println("The number of numbers in the file is " + i + " numbers.");

            System.out.println("The average of the numbers is " + aver + ".");

            System.out.println("The sum of the squared differences is " + num4);

            num5 = num4/i;
            System.out.println("The variance is " + num5);

            num6 = Math.sqrt(num5);
            System.out.println("The square root of the variance is " + num6);

            num7 = Math.round(num6);
            System.out.println("The square root rounded is " + num7);
            //prints variables and messages to console

            in.close();
            //closes
        }
        catch(FileNotFoundException error)
        //catch
        {

            System.out.println(error.getMessage());
            //runs try

        }

    }
}


import java.lang.Math;
import java.util.Scanner;
import java.io.*;
//importing
public class Read_num {
//class name
    /**
     * Name: Humna Sultan
     * Program Name: 7.2
     * Date: 15 March 2018
     * Extra Thing: finds square root of average of numbers
     */

    public static void main(String[] args)
    //main method
    {
        String line;
        int num, odd, even, l, num1, tot;
        String value2;
        File file;
        Scanner in;
        //declaring variables

        try
        //try
        {
            odd = 0;
            even= 0;
            l = 0;
            num1 = 0;
            tot = 0;
            //initializing variables

            file = new File("src/Numbers.txt");
            in = new Scanner(file);
            //setting file and in equal

            while(in.hasNext())
            {
                if (in.hasNextInt())
                //if statement that checks if there is more text
                {
                    l++;
                    num = in.nextInt();
                    System.out.println(num);
                    num1 = num;
                    tot = num1 + tot;
                    //prints numbers

                    if (num%2 == 0)
                    {
                        even++;
                    }
                    //counts even nums

                    else
                    {
                        odd++;
                        //counts off nums
                    }
                }
            }
            double aver = tot/l;
            //finds average

            System.out.println("The number of odd numbers is " + odd);
            System.out.println("The number of even numbers is " + even);
            System.out.println("The average of the numbers is " + aver);
            System.out.println("The square root of the average is " + Math.sqrt(aver));
            //prints off, even, average, and square root of average
        }
        catch(FileNotFoundException error)
        //catch
        {
            System.out.println(error.getMessage());
            //runs try
        }
        //catch

    }
}

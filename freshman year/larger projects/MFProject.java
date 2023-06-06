package mfproj;
//package
import java.util.Scanner;
import java.time.*;
import java.lang.Character;
import java.lang.String;
//importing
public class MFProj
/**
 * Name: Humna Sultan
 * Program Name: 6.7 Millennium Falcon Proj.
 * Date: 3 March 2019
 * Extra Thing: Yoda helps if there are 20 runs or more
 */
{
    //class name
    public static void main (String[] args)
//main method
    {
        Scanner in = new Scanner(System.in);
        System.out.println("********************************************
                *******");
        System.out.println("\tMillennium Falcon Launch
                Simulation");
                System.out.println("\t by System Navigator: Humna Sultan");
        System.out.println("********************************************
                *******");

        System.out.println("Please enter 'M' to launch the
                Millennium Falcon");
        char laun = in.next().charAt(0);
        while (laun != 'M' && laun != 'm')
        {
            System.out.println("You did not enter the letter 'M'!

                    Try again!");

            System.out.println("Please enter 'M' to launch the

                    Millennium Falcon");

                    laun = in.next().charAt(0);
        }
//beginning of program
//asks user to enter 'M' or 'm' and error traps
        double startTime = System.currentTimeMillis();
//starts timer once program starts
        int i = 1;
//initializes variable to be used later
        System.out.print("\t\tR2D2");
        System.out.print("\tC3P0");
        System.out.print("\tHan");
        System.out.print("\tLuke");
        System.out.print("\tChewy");
        System.out.print("\tLeia");
//prints names of people on board

        System.out.println();
        System.out.print("Run " + i + ":");
        int a = R2D2();
        int b = C3P0();
        int c = Han();
        int d = Luke();
        int e = Chewy();
        int f = Leia();
//sets variables to returns of other methods

//calls other methods

        int blob = a+b+c+d+e+f;
//sets blob to the sum of the above vars. Used later

        if (blob != 6)
        {
            System.out.print("\tNO LAUNCH!");
        }
//does first run; if this run has all people on board as
        ready, the program ends. Otherwise, the runs continue in the
        while loop
        i++;
//this variable is used for the runs
        while (blob != 6)
//while the sum of all of the people on board is not 6
            (it should be 6 because yes = 1 and and there are 6 characters.
            Each characters should == 1 and therefor, the sum should be 6
        {
            System.out.println();
            System.out.print("Run " + i + ":");
            a = R2D2();
            b = C3P0();
            c = Han();
            d = Luke();
            e = Chewy();
            f = Leia();
//sets variables to returns of other methods
//calls other methods
            blob = a+b+c+d+e+f;
//sets blob to the sum of the above vars. Used later
            if (i >= 20)
            {
                System.out.println();
                System.out.print("Yoda is here! He will use the
                        power of the force to start the launch of the Millennium
                        Falcon!");

                break;
            }
//if there are 20 or more runs, then yoda helps
//extra
            if (blob == 6)
            {

                break;
            }
//figures out if the sum of the people on board is 6;

            then breaks if positive

            System.out.print("\tNO LAUNCH!");
//prints if no break during loop
            i++;
//increases variable for runs
        }
//continues runs until break
        System.out.println();
        System.out.println("We are GO FOR LAUNCH!");
//lets user know that launch is ready
        double endTime = System.currentTimeMillis() - startTime;
//finds time elapsed
        double seconds = endTime*1000;
//finds time elapsed in seconds
        System.out.println("The simulation took " + seconds + "
                seconds.");
//rpints time elapsed
//prints final info
    }
    public static int R2D2()
    {
        int num1 = (int) (Math.random()*100 +1);
//finds random percentage
        int val1 = 3;
//used in ifs
        if (num1 >=40)
        {
            val1 = 1;
            System.out.print("\t\tGo");
        }
        if (num1 < 40)
        {
            val1 = 0;
            System.out.print("\t\tNo");
        }
        return val1;

//returns value of variable based on if statements. The
        variable is then used to print and do things in main
    }
    //R2D2
    public static int C3P0()
    {
        int num2 = (int) (Math.random()*100 +1);
//finds random percentage
        int val2 = 3;
//used in ifs
        if (num2 >=50)
        {
            val2 = 1;
            System.out.print("\tGo");
        }
        if (num2 < 50)
        {
            val2 = 0;
            System.out.print("\tNo");
        }
        return val2;
//returns value of variable based on if statements. The
        variable is then used to print and do things in main
    }
    //C3P0
    public static int Han()
    {
        int num3 = (int) (Math.random()*100 +1);
//finds random percentage
        int val3 = 3;
//used in ifs
        if (num3 >=30)
        {
            val3 = 1;
            System.out.print("\tGo");
        }
        if (num3 < 30)

        {
            val3 = 0;
            System.out.print("\tNo");
        }
        return val3;
//returns value of variable based on if statements. The
        variable is then used to print and do things in main
    }
    //Han
    public static int Luke()
    {
        int num4 = (int) (Math.random()*100 +1);
//finds random percentage
        int val4 = 3;
//used in ifs
        if (num4 >=20)
        {
            val4 = 1;
            System.out.print("\tGo");
        }
        if (num4 < 20)
        {
            val4 = 0;
            System.out.print("\tNo");
        }
        return val4;
//returns value of variable based on if statements. The
        variable is then used to print and do things in main
    }
    //Luke
    public static int Chewy()
    {
        int num5 = (int) (Math.random()*100 +1);
//finds random percentage
        int val5 = 3;
//used in ifs
        if (num5 >=35)

        {
            val5 = 1;
            System.out.print("\tGo");
        }
        if (num5 < 35)
        {
            val5 = 0;
            System.out.print("\tNo");
        }
        return val5;
//returns value of variable based on if statements. The
        variable is then used to print and do things in main
    }
    //Chewy
    public static int Leia()
    {
        int num6 = (int) (Math.random()*100 +1);
//finds random percentage
        int val6 = 3;
//used in ifs
        if (num6 >=45)
        {
            val6 = 1;
            System.out.print("\tGo");
        }
        if (num6 < 45)
        {
            val6 = 0;
            System.out.print("\tNo");
        }
        return val6;
//returns value of variable based on if statements. The
        variable is then used to print and do things in main
    }
//Leia
}

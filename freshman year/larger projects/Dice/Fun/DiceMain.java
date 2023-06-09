package Dice.Fun;
//package
import java.util.Scanner;
//importing
/**
 * Name: Humna Sultan
 * Program Name: 1. Dice Lab
 * Date: 16 June 2019

 * Extra N/A
 */
/**
 * Class to test Dice
 *
 * Simulates the rolling of two dice ten times,
 * printing the sum each time.
 *
 * @author andrianoff
 * @version June 25, 2014
 */
public class DiceMain
//class name
{
    public static void main(String[] args)
    //main method
    {
        Scanner in = new Scanner(System.in);
        //scanner
        Dice d = new Dice();
        //object
        int sum;
        int num = 0;
        int roll1;
        int roll2;
        int times1 = 0;
        int times2 = 0;
        int time = 0;
        int twel = 0;
        int dbl = 0;
        int one = 0;
        int two = 0;
        int thr = 0;
        int four = 0;
        int fiv = 0;
        int six = 0;
        int sev = 0;
        int eig = 0;

        int nin = 0;
        int ten = 0;
        int ele = 0;
        int twelt = 0;
        //initializing and declaring vars

        for (int i = 0; i <10000; i++)
        //rolls dice
        {
            num = num+1;
            roll1 = d.roll();
            times1++;
            System.out.println("Dice 1 - Roll " + num + ":: " + roll1);

            roll2 = d.roll2();
            times2++;
            time = times1 + times2;
            //rolls dice and counts times
            System.out.println("Dice 2 - Roll " + num + ":: " + roll2);

            sum = roll1+roll2;
            //finds sum
            System.out.println("Sum of Roll " + num + ":: " + sum);

            switch (sum)
            //switch statement - helps find number of times that specific sum is rolled
            {
                case 1: {
                    one++;
                }
                case 2: {
                    two++;
                }
                case 3: {
                    thr++;
                }
                case 4: {

                    four++;
                }
                case 5: {
                    fiv++;
                }
                case 6: {
                    six++;
                }
                case 7: {
                    sev++;
                }
                case 8: {
                    eig++;
                }
                case 9: {
                    nin++;
                }
                case 10: {
                    ten++;
                }
                case 11: {
                    ele++;
                }
                case 12: {
                    twelt++;
                }

            }

            System.out.println("**********************************");

        }
        System.out.println("The first die was rolled " + times1 + " times.");

        System.out.println("The second die was rolled " + times2 + " times.");

        System.out.println("The number of times that a die was rolled is " + time + ".");
        //prints info

        System.out.println("----------------------------------");

        System.out.println("The number of times a sum of 1 was rolled: " + one);

        System.out.println("The number of times a sum of 2 was rolled: " + two);

        System.out.println("The number of times a sum of 3 was rolled: " + thr);

        System.out.println("The number of times a sum of 4 was rolled: " + four);

        System.out.println("The number of times a sum of 5 was rolled: " + fiv);

        System.out.println("The number of times a sum of 6 was rolled: " + six);

        System.out.println("The number of times a sum of 7 was rolled: " + sev);

        System.out.println("The number of times a sum of 8 was rolled: " + eig);

        System.out.println("The number of times a sum of 9 was rolled: " + nin);

        System.out.println("The number of times a sum of 10 was rolled: " + ten);

        System.out.println("The number of times a sum of 11 was rolled: " + ele);

        System.out.println("The number of times a sum of 12 was rolled: " + twelt);

        //prints num of times that sum is rolled
    }
}

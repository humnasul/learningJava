package recursionFun;

import java.util.Scanner;

/**
 * Name: Humna Sultan
 * Program Name: recursion fun lab #2
 * Date: 21 January 2021
 * Extra: user input
 */

public class recursion2 {

    public static int counter = 0;
    //public variable

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        odds(x);
        System.out.println(counter);
    }
    //main method that calls method

    public static int odds(int x)
    {
        if (x == 0)
        {
            return 0;
        }
        if (x % 2 == 1)
        {
            counter = counter + (x%10);
            x = x/10;
            return counter + odds(x);
        }
        else
        {
            x = x/10;
            return 0 + odds(x);
        }
    }
    //method that calculates sum of odd numbers
}
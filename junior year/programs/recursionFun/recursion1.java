package recursionFun;

import java.util.Scanner;

/**
 * Name: Humna Sultan
 * Program Name: recursion fun lab #1
 * Date: 21 January 2021
 * Extra: user input
 */

public class recursion1 {
    public static int counter = 0;
    //public variable

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.println(evens(x));
    }
    //main method that calls method

    public static int evens(int x)
    {
        if (x == 0)
        {
            return 0;
        }
        if (x % 2 == 0)
        {
            counter++;
            x = x/10;
            return 1 + evens(x);
        }
        else
        {
            x = x/10;
            return 0 + evens(x);
        }

    }
    //method that finds even values

}
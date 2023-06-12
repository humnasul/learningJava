package recursionFun;

import java.util.Scanner;

/**
 * Name: Humna Sultan
 * Program Name: recursion fun lab #3
 * Date: 21 January 2021
 * Extra: user input
 */

public class recursion3 {

    public static int counter = 0;
    //public variable

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        threes(x);
        System.out.println(counter);
    }
    //main method that calls method

    public static int threes(int x)
    {
        if (x == 0)
        {
            return 0;
        }
        else if ((x/10 == 0) && (x % 10 == 3))
        {
            x = x/10;
            return counter + threes(x);
        }
        else if (x % 10 == 3)
        {
            x = x/10;
            counter++;
            return counter + 1 + threes(x);
        }
        else
        {
            x = x/10;
            return counter + threes(x);
        }
    }
    //method that finds threes in string
}

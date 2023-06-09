
import java.util.Scanner;
//import
/**
 * Name: Humna Sultan
 * Program Name: 8.9 Sort String
 * Date: 24 April 2019
 * Extra Thing: N/A
 */
public class CompTerm {
//class name

    public static void main(String[] args) {
    //main method

        String[] arr = new String[10];
        //declaring string
        Scanner in = new Scanner(System.in);
        //calling scanner
        for (int i = 0; i <= 9; i++)
        {
            System.out.println("Enter a computer term :: ");
            String fr = in.nextLine();
            arr[i] = fr;
        }
        //asking user for computer terms and putting in array

        System.out.println("\nThe following text is the computer "
                + "terms in the order provided (not sorted) :: \n");

        for(int i = 0; i<= 9; i++)
        {
            System.out.println(arr[i]);
        }
        //prints array

        int j;
        boolean flag = true;
        String temp;
        //declaring variables for sorting into alphabetical order
        while ( flag )
        //while flag == true
        {
            flag = false;
            for ( j = 0; j < arr.length - 1; j++ )
            {

                if ( arr [ j ].compareToIgnoreCase( arr [ j+1 ] ) > 0
                )
                { // ascending sort
                    temp = arr [ j ];
                    arr [ j ] = arr [ j+1 ]; //swapping
                    arr [ j+1] = temp;
                    flag = true;

                }
            //sorts array one by one

            }
        }
        System.out.println("\nHere are the computer terms in alphabetical order :: \n");

        for(int i = 0; i<= 9; i++)
        {
            System.out.println(arr[i]);
        }
        //prints sorted array
        System.out.println();
        //space
        for(int i = 0; i<=9; i++)
        {
            if (arr[i].equalsIgnoreCase("mouse"))
            {
                System.out.println("The term 'mouse' was found in the "
                        + i + " substring of the sorted array created.");
            }
            else
            {
                System.out.println("The term 'mouse' was not found in the "
                        + i + " substring of the sorted array created.");

            }
        }
        //mouse search
    }
}

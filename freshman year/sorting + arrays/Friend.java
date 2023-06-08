
import java.util.Scanner;
//import
/**
 * Name: Humna Sultan
 * Program Name: 8.9 Sort String
 * Date: 24 April 2019
 * Extra Thing: Another friend asked for
 */
public class Friend {
//class name

    public static void main(String[] args) {
    //main method
        String[] arr = new String[6];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <= 5; i++)
        {
            System.out.println("Enter the names of one of your friends :: ");

            String fr = in.nextLine();
            arr[i] = fr;
        }
        System.out.println("\nThe following text is the names of your friends in the order you provided :: \n");
        for(int i = 0; i<= 5; i++)
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
        System.out.println("\nHere are the names of your friends in alphabetical order :: \n");
        for(int i = 0; i<= 5; i++)
        {
            System.out.println(arr[i]);
        }
        //prints sorted array
        System.out.println();
        //makes space
        for(int i = 0; i<=5; i++)
        {
            if (arr[i].equalsIgnoreCase("oscar"))
            {
                System.out.println("The name Oscar was found in the " + i + " substring of the sorted array created");
            }
            else
            {

                System.out.println("The name Oscar was not found in the " + i + " substring of the sorted array created");

            }
        }
        //Oscar
    }
}


import java.util.Scanner;
//imports Scanner
public class desert {
    //class name
    public static void main(String[] args){
//main method
/**
 * Name: Humna Sultan
 * Program Name: 8.15
 * Date: 5 May 2019
 * Extra Thing: Asks about magical camel
 */

        Scanner in = new Scanner(System.in);
        //declaring scanner
        int[][] numbers = {{5, 1, 3, 1, 2, 4, 2, 1}, {2, 4, 0,
                3, 1, 4, 3, 2}, {6, 1, 5, 2, 1, 5, 4, 1}, {2, 3, 4, 1, 2, 2, 1,
                0}, {4, 1, 4, 2, 6, 4, 2, 3}, {1, 3, 3, 3, 4, 1, 5, 2}};
        //array with values

        System.out.println("\n");
        //skips a line

        for (int row = 0; row < 6; row++){

            for (int column = 0; column < 8; column++){
                System.out.print(numbers[row][column] + " ");
            }
        //prints array

            System.out.println();
            //skips line
        }

        System.out.println("\n");
        //skips line

        for(int a = 0; a < 8 ; a++){
            System.out.print(numbers[0][a] + " ");
        }
        //prints first row of array for second time

        System.out.println();
        //moves cursor to next line

        for (int row = 1; row < 5; row++){
        //prints 2nd and 4th rows; changes value to D if the surrounding numbers > 15
            System.out.print(numbers[row][0] + " ");
            for (int column = 1; column < 7; column++){
                if(numbers[row][column] + numbers[row -

                        1][column] + numbers[row + 1][column] + numbers[row][column - 1]
                        + numbers[row][column + 1] > 15){

                    System.out.print("D ");
                }else{
                    System.out.print(numbers[row][column] + " ");
                }
            }

            System.out.print(numbers[row][7] + " ");

            System.out.println();
        }

        for(int a = 0; a < 8 ; a++){
        //prints last row of array
            System.out.print(numbers[5][a] + " ");
        }

        System.out.println("\n------------------------");
        //border
        //extra

        System.out.println("What is the name of the magical camel in the Deadly Desert? ::");
        String camel = in.nextLine();

        if (camel.equalsIgnoreCase("nathaniel") ||
                camel.equalsIgnoreCase("nate"))
        {
            System.out.println("Mr. Snake has mercy for "
                    + "you for knowing the correct answer to the important question.");
        }
        else
        {
            System.out.println("Be careful; Mr. Snake and his children are after you...");
        }
        //extra; asks about magical camel

    }

}


import java.util.Scanner;
//importing Scanner
public class BinSea {
    //class name
    public static void main(String[] args) {
        //main method
/**
 * Name: Humna Sultan
 * Program Name: 8.6 Bin Search
 * Date: 12 April 2019
 * Extra Thing: colorful NetBeans
 */
        Scanner reply = new Scanner(System.in);
        //calls scanner

        int key = 22;
        //var for key value
        int[] nums = {11, 16, 22, 23, 34, 46, 48, 50, 75, 78};
        //array with nums
        binarySearch (nums, 0, 9, key);
        //calls binary search method
    }

    public static void binarySearch(int[ ] array, int lowerbound, int upperbound, int key)
    {
        //binary search method

        int position;
        int comparisonCount = 1; // counting the number of comparisons
        // To start, find the subscript of the middle position.
        position = ( lowerbound + upperbound) / 2;
        //sets position
        while((array[position] != key) && (lowerbound <= upperbound))
        {
        //looks for key value
            comparisonCount++;
            //adds to comparison count
            if (array[position] > key) // If the number is > key, decrease position by one.
            {
                upperbound = position - 1;
            }
            else
            {
                lowerbound = position + 1; // Else, increase position by one.
            }
            position = (lowerbound + upperbound) / 2;
        }
        if (lowerbound <= upperbound)
        //prints the following if lowerbound <= upperbound
        {
            System.out.println("The number " + key + " was found in array subscript " + position + ".");
            //prints where key value is located
            System.out.println("The binary search found the number after " + comparisonCount + " comparisons.");
            // printing the number of comparisons
        }
        else
            System.out.println("Sorry, the number is not in this array. The binary search made " +comparisonCount + " comparisons.");
            //prints if the key value is not found
    }
}
package geometry;

import java.util.Scanner;
//imports scanner
/**
 * Name: Humna Sultan
 * Program Name: 5.4 Geometric
 * Date: 18 January 2019
 * Extra Thing: N/A; user input for rows
 */
class InRiTri
//class name
{
    public static void main(String args[])
    //main method
    {
        int i,j,n;
        //variables
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows that you would like for the triangle :: ");
        n = in.nextInt();
        i = 1;
        j = 1;
        //initializing variables
        tri(i, j, n);
        //call to other method
    }
    public static void tri(int i, int j, int n)

    {
        for(i=1;i<=n;i++)
        {
            for(j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //method that prints out inverted right triangle
}

package geometry;

/**
 * Name: Humna Sultan
 * Program Name: 5.4 Geometric
 * Date: 16 January 2019
 * Extra Thing: N/A
 */
public class IsoRTri {
    //class name
    public static void main(String[] args)
    //main method
    {
        tri();
        //call to other method
    }
    public static void tri()
    //new method

    {
        for (int b = 0; b < 7; b++){
            for(int a = 0; a < b; a++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
    //prints triangle
}
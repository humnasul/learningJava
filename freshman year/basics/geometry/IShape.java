package geometry;

/**
 * Name: Humna Sultan
 * Program Name: 5.4 Geometric
 * Date: 18 January 2019
 * Extra Thing: N/A
 */

public class IShape {
    //class name
    public static void main(String[] args)
    //main method
    {
        rectan();
        sq();
        rectan();
        //call for other methods
    }
    public static void rectan()
    {
        for (int l = 0; l < 2; l++)
        {
            for (int i = 0; i < 2; i++)
            {
                int e = 8;
                for (int o = 0; i < e; i++)
                {
                    System.out.print("%");
                }
            }
            System.out.println();
        }
    }
    //method that prints bottom and top rectangles
    public static void sq()
    {

        for (int u = 0; u < 4; u++)
        {

            System.out.print(" ");
            System.out.print("%%%%%%");
            System.out.println();
        }
        //for loop for multiple lines of square

    }
    //method that prints square in middle
}
